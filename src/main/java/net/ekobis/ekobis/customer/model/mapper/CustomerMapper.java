package net.ekobis.ekobis.customer.model.mapper;

import net.ekobis.ekobis.customer.model.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.model.dto.request.CustomerIdRequest;
import net.ekobis.ekobis.customer.model.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.model.dto.response.CustomerDetailResponse;
import net.ekobis.ekobis.customer.model.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.model.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.model.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity fromCreateCustomerRequest(CreateCustomerRequest createCustomerRequest);

    CustomerEntity fromUpdateCustomerInformationRequest(UpdateCustomerInformationRequest updateCustomerInformationRequest);

    CustomerEntity fromCustomerIdRequest(CustomerIdRequest customerIdRequest);


    CustomerDetailResponse toCustomerDetailResponse(CustomerEntity customerEntity);

    CustomerResponse toCustomerResponse(CustomerEntity customerEntity);

    CustomersResponse toCustomersResponse(CustomerEntity customerEntity);

}
