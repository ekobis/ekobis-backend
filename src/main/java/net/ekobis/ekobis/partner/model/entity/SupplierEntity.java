package net.ekobis.ekobis.partner.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import net.ekobis.ekobis.partner.model.entity.enums.MoneyType;
import org.hibernate.annotations.UuidGenerator;

@Getter
@Setter
@Entity
@Table (name ="suppliers")
public class SupplierEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String supplierId;

    private String fullName;

    private String email;

    private String phone;

    private String webSite;

    private String idNo;

    @Enumerated(EnumType.STRING)
    private MoneyType moneyType;

    private String address;

    private String city;

    private String state;

    private String zip;

    private String country;

}
