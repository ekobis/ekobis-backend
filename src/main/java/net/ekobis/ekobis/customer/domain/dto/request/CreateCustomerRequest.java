package net.ekobis.ekobis.customer.domain.dto.request;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String street;

    private String city;

    private String postalCode;

    private String phone;

    private String email;

    private String password;

}
