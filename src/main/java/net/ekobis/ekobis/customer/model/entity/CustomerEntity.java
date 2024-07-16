package net.ekobis.ekobis.customer.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;

import net.ekobis.ekobis.customer.model.entity.enums.Role;

import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity extends BaseEntity{

    @Id
    @GeneratedValue
    @UuidGenerator
    private String customerId;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;

    private String street;
    private String city;
    private String postalCode;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

    private String password;

    @Temporal(TemporalType.DATE)
    private LocalDate createdDate;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Role> roles;
}
