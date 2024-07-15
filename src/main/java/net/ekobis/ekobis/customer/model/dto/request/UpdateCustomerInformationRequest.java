package net.ekobis.ekobis.customer.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerInformationRequest {

    @NotBlank
    private String customerId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private LocalDate birthDate;

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String postalCode;

    @NotBlank
    @Size(min = 11,max = 11)
    private String phone;
}
