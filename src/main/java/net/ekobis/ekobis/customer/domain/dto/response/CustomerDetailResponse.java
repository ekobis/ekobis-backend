package net.ekobis.ekobis.customer.domain.dto.response;

import jakarta.validation.constraints.Email;
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
public class CustomerDetailResponse {

    private String customerId;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String street;

    private String city;

    private String postalCode;

    private String phone;

    private String email;

}
