package net.ekobis.ekobis.category.domain.entity;

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
@Table(name = "categories")
@Entity
public class CategoryEntity extends BaseEntity {
    @Id
    @UuidGenerator
    @GeneratedValue
    private String categoryId;
    private String firstName;
}
