package net.ekobis.ekobis.category.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryInformationRequest {
    @NotBlank
    private Long categoryId;
    @NotBlank
    private String firstName;
}
