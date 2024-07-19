package net.ekobis.ekobis.inventory.service;

import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.response.ProductResponse;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ProductService {

    ResponseEntity<ProductResponse> createProduct(CreateProductRequest createProductRequest);


    ResponseEntity<List<ProductResponse>> getAllProduct();
}
