package net.ekobis.ekobis.customer.controller;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.customer.domain.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.customer.domain.dto.request.CustomerIdRequest;
import net.ekobis.ekobis.customer.domain.dto.request.UpdateCustomerInformationRequest;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerDetailResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomerResponse;
import net.ekobis.ekobis.customer.domain.dto.response.CustomersResponse;
import net.ekobis.ekobis.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return customerService.createCustomer(createCustomerRequest);
    }

    @PutMapping
    public ResponseEntity<CustomerResponse> updateCustomer(@RequestBody UpdateCustomerInformationRequest updateCustomerInformationRequest) {
        return customerService.updatedCustomer(updateCustomerInformationRequest);
    }

    @GetMapping
    public ResponseEntity<List<CustomersResponse>> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/customer-detail")
    public ResponseEntity<CustomerDetailResponse> getCustomerByIdForDetail(@RequestBody CustomerIdRequest customerIdRequest) {
        return customerService.getCustomerByIdForDetail(customerIdRequest);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCustomer(@RequestParam String customerId) {
        return customerService.deleteCustomerById(customerId);
    }

}
