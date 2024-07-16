package net.ekobis.ekobis.inventory.service;

import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<ProductEntity> createProduct(CreateProductRequest createProductRequest);

    ResponseEntity<List<ProductEntity>> getAllProduct();


}
