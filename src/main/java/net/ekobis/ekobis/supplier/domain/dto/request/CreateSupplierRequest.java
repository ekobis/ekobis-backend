package net.ekobis.ekobis.supplier.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSupplierRequest {

@NotBlank
    private Long supplierId;
    @NotBlank
    private String firstname;
    @NotBlank
    private Long contactNumber;
    @NotBlank
    private String street;
    @NotBlank
    private String city;
    @NotBlank
    private String postalCode;
}
