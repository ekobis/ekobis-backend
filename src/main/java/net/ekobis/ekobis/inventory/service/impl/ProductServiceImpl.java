package net.ekobis.ekobis.inventory.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import net.ekobis.ekobis.inventory.model.mapper.ProductMapper;
import net.ekobis.ekobis.inventory.repository.ProductRepository;
import net.ekobis.ekobis.inventory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public ResponseEntity<Map<String, Object>> createProduct(CreateProductRequest createProductRequest) {
        ProductEntity product = productMapper.fromCreateProductRequest(createProductRequest);

        Map<String,Object> response = new LinkedHashMap<>();
        response.put("status",true);
        response.put("data",product);

        productRepository.save(product);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<ProductEntity>> getAllProduct() {
        List<ProductEntity> productEntities = productRepository.findAll();

        return ResponseEntity.ok(productEntities);

    }
}
