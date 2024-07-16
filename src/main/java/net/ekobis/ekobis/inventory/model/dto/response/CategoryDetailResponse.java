package net.ekobis.ekobis.inventory.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDetailResponse {

    private Long categoryId;
    private String firstName;
}
