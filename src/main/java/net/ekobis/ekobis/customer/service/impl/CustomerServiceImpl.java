package net.ekobis.ekobis.customer.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.customer.domain.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.domain.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import net.ekobis.ekobis.customer.repository.CustomerRepository;
import net.ekobis.ekobis.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public ResponseEntity<CustomerResponse> createCustomer(CreateCustomerRequest customerRequest) {
        return null;
    }

    @Override
    public ResponseEntity<CustomerResponse> updatedCustomer(UpdateCustomerInformationRequest updateCustomerInformationRequest) {
        return null;
    }

    @Override
    public ResponseEntity<List<CustomersResponse>> getAllCustomer() {
        return null;
    }

    @Override
    public ResponseEntity<CustomerResponse> getCustomerById(String customerId) {
        return null;
    }

    @Override
    public ResponseEntity<CustomerResponse> deleteCustomerById(String customerId) {
        return null;
    }
}
