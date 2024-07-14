package net.ekobis.ekobis.customer.service.impl;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.customer.domain.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.domain.dto.request.CustomerIdRequest;
import net.ekobis.ekobis.customer.domain.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerDetailResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import net.ekobis.ekobis.customer.domain.mapper.CustomerMapper;
import net.ekobis.ekobis.customer.repository.CustomerRepository;
import net.ekobis.ekobis.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public ResponseEntity<CustomerResponse> createCustomer(CreateCustomerRequest customerRequest) {

        CustomerEntity customer = customerMapper.fromCreateCustomerRequest(customerRequest);

        CustomerResponse response = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<CustomerResponse> updatedCustomer(UpdateCustomerInformationRequest updateCustomerInformationRequest) {

        if(customerRepository.findById(updateCustomerInformationRequest.getCustomerId()).isEmpty()){
            throw new RuntimeException("Not Found ID");
        }

        CustomerEntity customer = customerMapper.fromUpdateCustomerInformationRequest(updateCustomerInformationRequest);

        CustomerResponse response = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<List<CustomersResponse>> getAllCustomer() {

        List<CustomersResponse> customerList =  customerRepository.findAll().stream().map(
                customerMapper::toCustomersResponse).collect(Collectors.toList());

        return ResponseEntity.ok(customerList);
    }

    @Override
    public ResponseEntity<CustomerDetailResponse> getCustomerByIdForDetail(CustomerIdRequest customerId) {
        if(customerRepository.findById(customerId.getCustomerId()).isEmpty()){
            throw new RuntimeException("Not Found ID");
        }

        CustomerEntity customer = customerMapper.fromCustomerIdRequest(customerId);

        CustomerDetailResponse response = customerMapper.toCustomerDetailResponse(customer);

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> deleteCustomerById(String customerId) {
        customerRepository.deleteById(customerId);
        return ResponseEntity.ok("Deleted");
    }
}
