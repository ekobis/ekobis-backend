package net.ekobis.ekobis.inventory.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import net.ekobis.ekobis.inventory.model.mapper.ProductMapper;
import net.ekobis.ekobis.inventory.repository.ProductRepository;
import net.ekobis.ekobis.inventory.service.ProductService;
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
