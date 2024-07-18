package net.ekobis.ekobis.partner.controller;

import lombok.RequiredArgsConstructor;
import net.ekobis.ekobis.partner.model.dto.request.CreateCustomerRequest;
import net.ekobis.ekobis.partner.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
}
