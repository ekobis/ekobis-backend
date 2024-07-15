package net.ekobis.ekobis.invoice.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import net.ekobis.ekobis.sales.domain.entity.Sales;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Table(name ="invoices")
@Getter
@Setter
public class InvoiceEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String invoiceId;
    private String invoiceNumber;
    private Long date;
    private Long customerId;
    private String totalAmount;
    private String status;

    @OneToMany(mappedBy = "InvoiceEntity", cascade = CascadeType.ALL)
    private List<Sales> sales;
}
