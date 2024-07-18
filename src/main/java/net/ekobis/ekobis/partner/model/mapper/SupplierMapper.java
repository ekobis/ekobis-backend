package net.ekobis.ekobis.partner.model.mapper;


import net.ekobis.ekobis.partner.model.dto.request.CreateSupplierRequest;
import net.ekobis.ekobis.partner.model.entity.SupplierEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierEntity fromCreateSupplierRequest(CreateSupplierRequest createSupplierRequest);

}
