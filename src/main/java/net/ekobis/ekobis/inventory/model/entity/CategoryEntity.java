package net.ekobis.ekobis.inventory.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "categories")
@Entity
public class CategoryEntity extends BaseEntity {
    @Id
    @UuidGenerator
    @GeneratedValue
    private String categoryId;
    private String name;

    @OneToMany
    private List<ProductEntity> products;
}
