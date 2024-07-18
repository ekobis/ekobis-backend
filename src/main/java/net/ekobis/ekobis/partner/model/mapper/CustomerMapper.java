package net.ekobis.ekobis.partner.model.mapper;

import net.ekobis.ekobis.partner.model.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.partner.model.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity fromCreateCustomerRequest(CreateCustomerRequest createCustomerRequest);

}
