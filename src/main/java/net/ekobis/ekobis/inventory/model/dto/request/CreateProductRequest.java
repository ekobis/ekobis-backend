package net.ekobis.ekobis.inventory.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    private String productName;

    private String description;

    private Double price;

    private Long stockQuantity;

}
