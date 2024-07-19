package net.ekobis.ekobis.inventory.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.response.ProductResponse;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import net.ekobis.ekobis.inventory.model.mapper.ProductMapper;
import net.ekobis.ekobis.inventory.repository.ProductRepository;
import net.ekobis.ekobis.inventory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public ResponseEntity<ProductResponse> createProduct(CreateProductRequest createProductRequest) {

        ProductEntity productEntity = productMapper.fromCreateProductRequest(createProductRequest);

        ProductResponse response = productMapper.toProductResponse(productRepository.save(productEntity));

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @Override
    public ResponseEntity<List<ProductResponse>> getAllProduct() {

        List<ProductResponse> productResponses = productRepository.findAll().stream()
                .map(productMapper::toProductResponse).toList();

        return new ResponseEntity<>(productResponses, HttpStatus.OK);
    }
}
