package net.ekobis.ekobis.inventory.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {

    @NotBlank
    @NotNull
    private String productId;

    @NotBlank
    private String productName;

    @NotBlank
    private String description;

    @NotNull
    private Double salePrice;

    @NotNull
    private Double purchasePrice;

    private Double taxRate;

    @NotBlank
    private String category;

}
