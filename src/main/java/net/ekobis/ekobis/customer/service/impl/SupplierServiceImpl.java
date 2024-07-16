package net.ekobis.ekobis.customer.service.impl;

import lombok.RequiredArgsConstructor;

import net.ekobis.ekobis.customer.model.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.customer.model.dto.request.SupplierIdRequest;
import net.ekobis.ekobis.customer.model.dto.request.UpdateSupplierInformationRequest;
import net.ekobis.ekobis.customer.model.dto.response.SupplierDetailResponse;
import net.ekobis.ekobis.customer.model.dto.response.SupplierResponse;
import net.ekobis.ekobis.customer.model.entity.SupplierEntity;
import net.ekobis.ekobis.customer.model.mapper.SupplierMapper;
import net.ekobis.ekobis.customer.repository.SupplierRepository;
import net.ekobis.ekobis.customer.service.SupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {


    private final SupplierRepository supplierRepository;
    private final SupplierMapper supplierMapper;

    @Override
    public ResponseEntity<SupplierResponse> createSupplier(CreateSupplierRequest supplierRequest) {

        SupplierEntity supplier = supplierMapper.fromCreateSupplierRequest(supplierRequest);

        SupplierResponse response = supplierMapper.toSupplierResponse(supplier);

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<SupplierResponse> updatedSupplier(UpdateSupplierInformationRequest updateSupplierInformationRequest) {

        if(supplierRepository.findById(String.valueOf(updateSupplierInformationRequest.getSupplierId())).isEmpty()){
            throw new RuntimeException("Not Found ID");
        }

        SupplierEntity supplier = supplierMapper.fromUpdateSupplierInformationRequest(updateSupplierInformationRequest);

        SupplierResponse response = supplierMapper.toSupplierResponse(supplier);

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<List<SupplierResponse>> getAllSupplier() {

        List<SupplierResponse> supplierList =  supplierRepository.findAll().stream().map(
                supplierMapper::toSupplierResponse).collect(Collectors.toList());

        return ResponseEntity.ok(supplierList);
    }

    @Override
    public ResponseEntity<SupplierDetailResponse> getSupplieryByIdForDetail(SupplierIdRequest supplierId) {
        if(supplierRepository.findById(String.valueOf(supplierId.getSupplierId())).isEmpty()){
            throw new RuntimeException("Not Found ID");
        }

        SupplierEntity supplier = supplierMapper.fromSupplierIdRequest(supplierId);

        SupplierDetailResponse response = supplierMapper.toSupplierDetailResponse(supplier);

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> deleteSupplierById(String supplierId) {
        supplierRepository.deleteById(supplierId);
        return ResponseEntity.ok("Deleted");
    }

    @Override
    public ResponseEntity<SupplierDetailResponse> getSupplierByIdForDetail(SupplierIdRequest supplierId) {
        return null;
    }
}
