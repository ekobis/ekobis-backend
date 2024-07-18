package net.ekobis.ekobis.partner.controller;

import lombok.RequiredArgsConstructor;

import net.ekobis.ekobis.partner.model.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.partner.service.SupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/suppliers")
public class SupplierController {
    private final SupplierService supplierService;
}
