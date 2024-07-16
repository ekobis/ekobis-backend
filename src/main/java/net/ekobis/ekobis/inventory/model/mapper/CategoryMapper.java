package net.ekobis.ekobis.inventory.model.mapper;

import net.ekobis.ekobis.inventory.model.dto.request.CategoryIdRequest;
import net.ekobis.ekobis.inventory.model.dto.request.CreateCategoryRequest;
import net.ekobis.ekobis.inventory.model.dto.request.UpdateCategoryInformationRequest;
import net.ekobis.ekobis.inventory.model.dto.response.CategoryDetailResponse;
import net.ekobis.ekobis.inventory.model.dto.response.CategoryResponse;
import net.ekobis.ekobis.inventory.model.entity.CategoryEntity;
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
