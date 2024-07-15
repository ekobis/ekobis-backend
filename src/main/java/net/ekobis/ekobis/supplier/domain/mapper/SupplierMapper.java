package net.ekobis.ekobis.supplier.domain.mapper;


import net.ekobis.ekobis.supplier.domain.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.supplier.domain.dto.request.SupplierIdRequest;
import net.ekobis.ekobis.supplier.domain.dto.request.UpdateSupplierInformationRequest;
import net.ekobis.ekobis.supplier.domain.dto.response.SupplierDetailResponse;
import net.ekobis.ekobis.supplier.domain.dto.response.SupplierResponse;
import net.ekobis.ekobis.supplier.domain.entity.SupplierEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierEntity fromCreateSupplierRequest(CreateSupplierRequest createSupplierRequest);

    SupplierEntity fromUpdateSupplierInformationRequest(UpdateSupplierInformationRequest updateSupplierInformationRequest);

    SupplierEntity fromSupplierIdRequest(SupplierIdRequest supplierIdRequest);


    SupplierDetailResponse toSupplierDetailResponse(SupplierEntity supplierEntity);

    SupplierResponse toSupplierResponse(SupplierEntity supplierEntity);


}
