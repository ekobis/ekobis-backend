package net.ekobis.ekobis.product.service;

import net.ekobis.ekobis.product.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.product.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<ProductEntity> createProduct(CreateProductRequest createProductRequest);

    ResponseEntity<List<ProductEntity>> getAllProduct();


}
