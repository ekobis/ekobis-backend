package net.ekobis.ekobis.customer.controller;

import lombok.RequiredArgsConstructor;

import net.ekobis.ekobis.customer.model.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.customer.model.dto.request.SupplierIdRequest;
import net.ekobis.ekobis.customer.model.dto.request.UpdateSupplierInformationRequest;
import net.ekobis.ekobis.customer.model.dto.response.SupplierDetailResponse;
import net.ekobis.ekobis.customer.model.dto.response.SupplierResponse;
import net.ekobis.ekobis.customer.service.SupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/suppliers")
public class SupplierController {



        private final SupplierService supplierService;

        @PostMapping
        public ResponseEntity<SupplierResponse> createSupplier(@RequestBody CreateSupplierRequest createSupplierRequest) {
            return supplierService.createSupplier(createSupplierRequest);
        }

        @PutMapping
        public ResponseEntity<SupplierResponse> updateSupplier(@RequestBody UpdateSupplierInformationRequest updateSupplierInformationRequest) {
            return supplierService.updatedSupplier(updateSupplierInformationRequest);
        }

    @GetMapping
    public ResponseEntity<List<SupplierResponse>> getAllSupplier() {
        return supplierService.getAllSupplier();
    }

        @GetMapping("/supplier-detail")
        public ResponseEntity<SupplierDetailResponse> getSupplierByIdForDetail(@RequestBody SupplierIdRequest supplierIdRequest) {
            return supplierService.getSupplierByIdForDetail(supplierIdRequest);
        }

        @DeleteMapping
        public ResponseEntity<?> deleteSupplier(@RequestParam String supplierId) {
            return supplierService.deleteSupplierById(supplierId);
        }
}
