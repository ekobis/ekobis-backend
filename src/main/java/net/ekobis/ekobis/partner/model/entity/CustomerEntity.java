package net.ekobis.ekobis.partner.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;

import net.ekobis.ekobis.partner.model.entity.enums.MoneyType;
import org.hibernate.annotations.UuidGenerator;

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

    private String fullName;

    @Email
    private String email;

    private String phone;

    private String idNo;

    @Enumerated(EnumType.STRING)
    private MoneyType moneyType;

    private String address;

    private String city;

    private String state;

    private String zip;

    private String country;
}
