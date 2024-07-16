package net.ekobis.ekobis.finance.model.entity;

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
@Table(name ="sales")


public class Sales extends BaseEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String salesId;
    private Long productId;
    private Long invoiceId;
    private String quantity;
    private String unitPrice;
    private String totalPrice;
    private String tax;
}
