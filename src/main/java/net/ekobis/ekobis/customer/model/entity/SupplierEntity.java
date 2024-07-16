package net.ekobis.ekobis.customer.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
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
    private String firstname;
    private Long contactNumber;
    private String street;
    private String city;
    private String postalCode;

}
