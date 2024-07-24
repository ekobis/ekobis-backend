package net.ekobis.ekobis.inventory.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.common.util.response.DataResponse;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.request.UpdateProductRequest;
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
    public ResponseEntity<DataResponse<ProductResponse>> createProduct(@Valid @RequestBody CreateProductRequest createProductRequest) {
        return productService.createProduct(createProductRequest);
    }

    @PutMapping
    public ResponseEntity<DataResponse<ProductResponse>> updateProduct(@Valid @RequestBody UpdateProductRequest updateProductRequest) {
        return productService.updateProduct(updateProductRequest);
    }

    @GetMapping
    public ResponseEntity<DataResponse<List<ProductResponse>>> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<DataResponse<ProductResponse>> getProduct(@PathVariable String productId) {
        return productService.getProductById(productId);
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable String productId) {
        return productService.deleteProduct(productId);
    }
}
