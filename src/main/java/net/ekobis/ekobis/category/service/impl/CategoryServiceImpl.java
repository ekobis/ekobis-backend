package net.ekobis.ekobis.category.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.category.domain.dto.request.CategoryIdRequest;
import net.ekobis.ekobis.category.domain.dto.request.CreateCategoryRequest;
import net.ekobis.ekobis.category.domain.dto.request.UpdateCategoryInformationRequest;
import net.ekobis.ekobis.category.domain.dto.response.CategoryDetailResponse;
import net.ekobis.ekobis.category.domain.dto.response.CategoryResponse;
import net.ekobis.ekobis.category.domain.entity.CategoryEntity;
import net.ekobis.ekobis.category.domain.mapper.CategoryMapper;
import net.ekobis.ekobis.category.repository.CategoryRepository;
import net.ekobis.ekobis.category.service.CategoryService;
import net.ekobis.ekobis.customer.domain.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public ResponseEntity<CategoryResponse> createCategory(CreateCategoryRequest categoryRequest) {

        CategoryEntity category = categoryMapper.fromCreateCategoryRequest(categoryRequest);

        CategoryResponse response = categoryMapper.toCategoryResponse(category);

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<CategoryResponse> updatedCategory(UpdateCategoryInformationRequest updateCategoryInformationRequest) {

        if(categoryRepository.findById(String.valueOf(updateCategoryInformationRequest.getCategoryId())).isEmpty()){
            throw new RuntimeException("Not Found ID");
        }

        CategoryEntity category = categoryMapper.fromUpdateCategoryInformationRequest(updateCategoryInformationRequest);

        CategoryResponse response = categoryMapper.toCategoryResponse(category);

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<List<CategoryResponse>> getAllCategory() {

        List<CategoryResponse> categoryList =  categoryRepository.findAll().stream().map(
                categoryMapper::toCategorysResponse).collect(Collectors.toList());

        return ResponseEntity.ok(categoryList);
    }

    @Override
    public ResponseEntity<CategoryDetailResponse> getCategoryByIdForDetail(CategoryIdRequest categoryId) {
        if(categoryRepository.findById(categoryId.getCategoryId()).isEmpty()){
            throw new RuntimeException("Not Found ID");
        }

        CategoryEntity category = categoryMapper.fromCategoryIdRequest(categoryId);

        CategoryDetailResponse response = categoryMapper.toCategoryDetailResponse(category);

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> deleteCategoryById(String customerId) {
        categoryRepository.deleteById(customerId);
        return ResponseEntity.ok("Deleted");
    }

}