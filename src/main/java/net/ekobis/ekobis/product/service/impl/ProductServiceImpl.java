package net.ekobis.ekobis.product.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.product.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.product.model.entity.ProductEntity;
import net.ekobis.ekobis.product.model.mapper.ProductMapper;
import net.ekobis.ekobis.product.repository.ProductRepository;
import net.ekobis.ekobis.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public ResponseEntity<ProductEntity> createProduct(CreateProductRequest createProductRequest) {

        ProductEntity product = productMapper.fromCreateProductRequest(createProductRequest);

        return ResponseEntity.ok(productRepository.save(product));

    }


    @Override
    public ResponseEntity<List<ProductEntity>> getAllProduct() {
        List<ProductEntity> productEntities = productRepository.findAll();

        return ResponseEntity.ok(productEntities);

    }
}
