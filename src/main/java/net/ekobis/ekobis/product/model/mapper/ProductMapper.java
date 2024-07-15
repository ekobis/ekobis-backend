package net.ekobis.ekobis.product.model.mapper;

import net.ekobis.ekobis.product.model.dto.request.CreateProductRequest;
import net.ekobis.ekobis.product.model.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductEntity fromCreateProductRequest(CreateProductRequest createProductRequest);

}
