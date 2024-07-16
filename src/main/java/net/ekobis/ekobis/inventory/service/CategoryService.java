package net.ekobis.ekobis.inventory.service;

import net.ekobis.ekobis.inventory.model.dto.request.CategoryIdRequest;
import net.ekobis.ekobis.inventory.model.dto.request.CreateCategoryRequest;
import net.ekobis.ekobis.inventory.model.dto.request.UpdateCategoryInformationRequest;
import net.ekobis.ekobis.inventory.model.dto.response.CategoryDetailResponse;
import net.ekobis.ekobis.inventory.model.dto.response.CategoryResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    ResponseEntity<CategoryResponse> createCategory(CreateCategoryRequest categoryRequest);

    ResponseEntity<CategoryResponse> updatedCategory(UpdateCategoryInformationRequest updateCategoryRequest);

    ResponseEntity<List<CategoryResponse>> getAllCategory();



    ResponseEntity<CategoryDetailResponse> getCategoryByIdForDetail(CategoryIdRequest categoryId);

    ResponseEntity<?> deleteCategoryById(String CategoryId);
}
