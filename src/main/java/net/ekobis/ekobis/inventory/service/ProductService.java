package net.ekobis.ekobis.inventory.service;

import net.ekobis.ekobis.common.util.response.DataResponse;
import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.request.UpdateProductRequest;
import net.ekobis.ekobis.inventory.model.dto.response.ProductResponse;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<DataResponse<ProductResponse>> createProduct(CreateProductRequest createProductRequest);

    ResponseEntity<DataResponse<ProductResponse>> updateProduct(UpdateProductRequest updateProductRequest);

    ResponseEntity<DataResponse<List<ProductResponse>>> getAllProduct();

    ResponseEntity<DataResponse<ProductResponse>> getProductById(String productId);

    ResponseEntity<String> deleteProduct(String productId);
}
