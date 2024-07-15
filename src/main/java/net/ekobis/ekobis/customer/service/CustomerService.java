package net.ekobis.ekobis.customer.service;

import net.ekobis.ekobis.customer.model.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.model.dto.request.CustomerIdRequest;
import net.ekobis.ekobis.customer.model.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.model.dto.response.CustomerDetailResponse;
import net.ekobis.ekobis.customer.model.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.model.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.model.entity.CustomerEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    ResponseEntity<CustomerResponse> createCustomer(CreateCustomerRequest customerRequest);

    ResponseEntity<CustomerResponse> updatedCustomer(UpdateCustomerInformationRequest updateCustomerInformationRequest);

    ResponseEntity<List<CustomersResponse>> getAllCustomer();

    ResponseEntity<CustomerDetailResponse> getCustomerByIdForDetail(CustomerIdRequest customerId);

    ResponseEntity<?> deleteCustomerById(String customerId);

    CustomerEntity getByEmail(String email);
}
