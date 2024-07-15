package net.ekobis.ekobis.category.domain.mapper;

import net.ekobis.ekobis.category.domain.dto.request.CategoryIdRequest;
import net.ekobis.ekobis.category.domain.dto.request.CreateCategoryRequest;
import net.ekobis.ekobis.category.domain.dto.request.UpdateCategoryInformationRequest;
import net.ekobis.ekobis.category.domain.dto.response.CategoryDetailResponse;
import net.ekobis.ekobis.category.domain.dto.response.CategoryResponse;
import net.ekobis.ekobis.category.domain.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {


    CategoryEntity fromCreateCategoryRequest(CreateCategoryRequest createCategoryRequest);

    CategoryEntity fromUpdateCategoryInformationRequest(UpdateCategoryInformationRequest updateCategoryRequest);

    CategoryEntity fromCategoryIdRequest(CategoryIdRequest categoryIdRequest);


    CategoryDetailResponse toCategoryDetailResponse(CategoryEntity categoryEntity);

    CategoryResponse toCategoryResponse(CategoryEntity categoryEntity);

    CategoryResponse toCategorysResponse(CategoryEntity categoryEntity);
}
