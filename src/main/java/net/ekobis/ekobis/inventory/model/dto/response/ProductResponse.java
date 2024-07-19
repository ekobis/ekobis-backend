package net.ekobis.ekobis.inventory.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private String productName;

    private String description;

    private Double salePrice;

    private Double purchasePrice;

    private Double taxRate;

    private String category;

}
