package net.ekobis.ekobis.customer.domain.mapper;

import net.ekobis.ekobis.customer.domain.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.domain.dto.request.CustomerIdRequest;
import net.ekobis.ekobis.customer.domain.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerDetailResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity fromCreateCustomerRequest(CreateCustomerRequest createCustomerRequest);

    CustomerEntity fromUpdateCustomerInformationRequest(UpdateCustomerInformationRequest updateCustomerInformationRequest);

    CustomerEntity fromCustomerIdRequest(CustomerIdRequest customerIdRequest);


    CustomerDetailResponse toCustomerDetailResponse(CustomerEntity customerEntity);

    CustomerResponse toCustomerResponse(CustomerEntity customerEntity);

    CustomersResponse toCustomersResponse(CustomerEntity customerEntity);

}
