package net.ekobis.ekobis.inventory.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

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

    private Double salePrice;

    private Double purchasePrice;

    private Double taxRate;

    private String category;
}
