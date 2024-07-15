package net.ekobis.ekobis.expence.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.category.domain.entity.CategoryEntity;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import net.ekobis.ekobis.invoice.domain.entity.InvoiceEntity;
import net.ekobis.ekobis.supplier.domain.entity.SupplierEntity;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table (name = "expences")
public class ExpenceEntity extends BaseEntity {


    @Id
    @GeneratedValue
    @UuidGenerator
    private String expenceId;
    private String firstname;
    private String amount;
    private LocalDate date;
    private String category;
    private String supplierId;

}
