package net.ekobis.ekobis.inventory.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.common.util.response.DataResponse;
import net.ekobis.ekobis.common.util.response.helper.ResponseHelper;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.request.UpdateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.response.ProductResponse;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import net.ekobis.ekobis.inventory.model.mapper.ProductMapper;
import net.ekobis.ekobis.inventory.model.util.exceptions.DeletedProductException;
import net.ekobis.ekobis.inventory.model.util.exceptions.NotFoundProductId;
import net.ekobis.ekobis.inventory.repository.ProductRepository;
import net.ekobis.ekobis.inventory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public ResponseEntity<DataResponse<ProductResponse>> createProduct(CreateProductRequest createProductRequest) {

        ProductEntity productEntity = productMapper.fromCreateProductRequest(createProductRequest);

        productEntity.setActive(true);

        ProductResponse response = productMapper.toProductResponse(productRepository.save(productEntity));

        return new ResponseEntity<>(ResponseHelper.POST_DATA(response), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<DataResponse<ProductResponse>> updateProduct(UpdateProductRequest updateProductRequest) {

        if(!productRepository.findById(updateProductRequest.getProductId()).orElseThrow(NotFoundProductId::new).isActive()){
            throw new DeletedProductException();
        }

        ProductEntity productEntity = productMapper.fromUpdateProductRequest(updateProductRequest);

        ProductResponse response = productMapper.toProductResponse(productRepository.save(productEntity));

        return new ResponseEntity<>(ResponseHelper.PUT_DATA(response), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<DataResponse<List<ProductResponse>>> getAllProduct() {

        List<ProductResponse> productResponses = productRepository.findAllByActiveIsTrue().stream()
                .map(productMapper::toProductResponse).toList();

        return new ResponseEntity<>(ResponseHelper.LIST_DATA(productResponses), HttpStatus.OK);
    }


    @Override
    public ResponseEntity<DataResponse<ProductResponse>> getProductById(String productId) {

        ProductEntity productEntity = productRepository.findById(productId).orElseThrow(NotFoundProductId::new);

        ProductResponse response = productMapper.toProductResponse(productEntity);

        return new ResponseEntity<>(ResponseHelper.GET_DATA(response), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteProduct(String productId) {

        ProductEntity productEntity = productRepository.findById(productId).orElseThrow(NotFoundProductId::new);

        if(!productEntity.isActive()){
            throw new DeletedProductException();
        }

        productEntity.setActive(false);

        Boolean statusForProduct =  productEntity.isActive();

        productRepository.save(productEntity);

        return new ResponseEntity<>("Deleted Product", HttpStatus.OK);
    }
}
