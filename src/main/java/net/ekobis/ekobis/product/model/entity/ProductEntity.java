package net.ekobis.ekobis.product.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity extends BaseEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private String productId;

    private String productName;

    private String description;

    private Double price;

    private Long stockQuantity;
}
