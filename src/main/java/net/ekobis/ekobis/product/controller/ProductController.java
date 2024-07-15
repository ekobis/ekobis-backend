package net.ekobis.ekobis.product.controller;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.product.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.product.model.entity.ProductEntity;
import net.ekobis.ekobis.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    private ResponseEntity<ProductEntity> createProduct(@RequestBody CreateProductRequest product) {
        return productService.createProduct(product);
    }

}
