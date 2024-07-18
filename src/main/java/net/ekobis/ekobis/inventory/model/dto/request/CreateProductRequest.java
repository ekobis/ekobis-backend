package net.ekobis.ekobis.inventory.model.dto.request;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.ekobis.ekobis.inventory.model.entity.CategoryEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    private String name;

    private String description;

    private Double price;

    private Double purchasePrice;

    private Double tax;

    private CategoryEntity category;
}
