package net.ekobis.ekobis.inventory.model.mapper;

import net.ekobis.ekobis.inventory.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductEntity fromCreateProductRequest(CreateProductRequest createProductRequest);
}
