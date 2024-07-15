package net.ekobis.ekobis.supplier.service;

import net.ekobis.ekobis.supplier.domain.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.supplier.domain.dto.request.SupplierIdRequest;
import net.ekobis.ekobis.supplier.domain.dto.request.UpdateSupplierInformationRequest;
import net.ekobis.ekobis.supplier.domain.dto.response.SupplierDetailResponse;
import net.ekobis.ekobis.supplier.domain.dto.response.SupplierResponse;
import net.ekobis.ekobis.supplier.domain.dto.response.SuppliersResponse;
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
