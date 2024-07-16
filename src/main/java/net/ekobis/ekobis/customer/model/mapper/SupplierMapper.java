package net.ekobis.ekobis.customer.model.mapper;


import net.ekobis.ekobis.customer.model.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.customer.model.dto.request.SupplierIdRequest;
import net.ekobis.ekobis.customer.model.dto.request.UpdateSupplierInformationRequest;
import net.ekobis.ekobis.customer.model.dto.response.SupplierDetailResponse;
import net.ekobis.ekobis.customer.model.dto.response.SupplierResponse;
import net.ekobis.ekobis.customer.model.entity.SupplierEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierEntity fromCreateSupplierRequest(CreateSupplierRequest createSupplierRequest);

    SupplierEntity fromUpdateSupplierInformationRequest(UpdateSupplierInformationRequest updateSupplierInformationRequest);

    SupplierEntity fromSupplierIdRequest(SupplierIdRequest supplierIdRequest);


    SupplierDetailResponse toSupplierDetailResponse(SupplierEntity supplierEntity);

    SupplierResponse toSupplierResponse(SupplierEntity supplierEntity);


}
