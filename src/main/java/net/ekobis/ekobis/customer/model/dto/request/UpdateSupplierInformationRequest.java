package net.ekobis.ekobis.customer.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSupplierInformationRequest {
    @NotBlank
    private Long supplierId;
    @NotBlank
    private String firstname;
    @NotBlank
    private Long contactNumber;
}
