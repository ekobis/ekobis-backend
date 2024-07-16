package net.ekobis.ekobis.finance.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import org.hibernate.annotations.UuidGenerator;

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

}
