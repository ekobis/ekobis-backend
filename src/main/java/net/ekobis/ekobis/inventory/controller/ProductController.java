package net.ekobis.ekobis.inventory.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.response.ProductResponse;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import net.ekobis.ekobis.inventory.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody CreateProductRequest createProductRequest) {
        return productService.createProduct(createProductRequest);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable String productId) {
        return productService.getProductById(productId);
    }

}
