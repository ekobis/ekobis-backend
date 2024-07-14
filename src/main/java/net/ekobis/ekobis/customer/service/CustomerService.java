package net.ekobis.ekobis.customer.service;

import net.ekobis.ekobis.customer.domain.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.domain.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    ResponseEntity<CustomerResponse> createCustomer(CreateCustomerRequest customerRequest);

    ResponseEntity<CustomerResponse> updatedCustomer(UpdateCustomerInformationRequest updateCustomerInformationRequest);

    ResponseEntity<List<CustomersResponse>> getAllCustomer();

    ResponseEntity<CustomerResponse> getCustomerById(String customerId);

    ResponseEntity<CustomerResponse> deleteCustomerById(String customerId);
}
