package net.ekobis.ekobis.inventory.controller;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.inventory.model.dto.request.CategoryIdRequest;
import net.ekobis.ekobis.inventory.model.dto.request.CreateCategoryRequest;
import net.ekobis.ekobis.inventory.model.dto.request.UpdateCategoryInformationRequest;
import net.ekobis.ekobis.inventory.model.dto.response.CategoryDetailResponse;
import net.ekobis.ekobis.inventory.model.dto.response.CategoryResponse;
import net.ekobis.ekobis.inventory.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categorys")
public class CategoryController {

    private final CategoryService categoryService;


    @PostMapping
    public ResponseEntity<CategoryResponse> createCategory(@RequestBody CreateCategoryRequest createCategoryRequest) {
        return categoryService.createCategory(createCategoryRequest);
    }

    @PutMapping
    public ResponseEntity<CategoryResponse> updateCategory(@RequestBody UpdateCategoryInformationRequest updateCategoryRequest) {
        return categoryService.updatedCategory(updateCategoryRequest);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/customer-detail")
    public ResponseEntity<CategoryDetailResponse> getCategoryByIdForDetail(@RequestBody CategoryIdRequest categoryIdRequest) {
        return categoryService.getCategoryByIdForDetail(categoryIdRequest);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCustomer(@RequestParam String categoryId) {
        return categoryService.deleteCategoryById(categoryId);
    }
}
