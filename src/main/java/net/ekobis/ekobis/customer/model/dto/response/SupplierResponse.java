package net.ekobis.ekobis.customer.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierResponse {

    private Long supplierId;
    private String firstname;
    private Long contactNumber;

}
