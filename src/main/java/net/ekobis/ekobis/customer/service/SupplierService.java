package net.ekobis.ekobis.customer.service;

import net.ekobis.ekobis.customer.model.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.customer.model.dto.request.SupplierIdRequest;
import net.ekobis.ekobis.customer.model.dto.request.UpdateSupplierInformationRequest;
import net.ekobis.ekobis.customer.model.dto.response.SupplierDetailResponse;
import net.ekobis.ekobis.customer.model.dto.response.SupplierResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SupplierService {

    ResponseEntity<SupplierResponse> createSupplier(CreateSupplierRequest supplierRequest);

    ResponseEntity<SupplierResponse> updatedSupplier(UpdateSupplierInformationRequest updateSupplierInformationRequest);

    ResponseEntity<List<SupplierResponse>> getAllSupplier();

    ResponseEntity<SupplierDetailResponse> getSupplierByIdForDetail(SupplierIdRequest supplierId);

    ResponseEntity<SupplierDetailResponse> getSupplieryByIdForDetail(SupplierIdRequest supplierId);

    ResponseEntity<?> deleteSupplierById(String supplierId);
}
