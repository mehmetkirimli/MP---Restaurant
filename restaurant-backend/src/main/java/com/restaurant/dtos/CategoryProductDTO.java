package com.restaurant.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryProductDTO {

    @Schema(description = "ID of the product", required = true, example = "null")
    private Long id;

    @Schema(description = "Name of the product", example = "Margherita Pizza", required = true)
    private String name;

    @Schema(description = "Description of the product", example = "Classic Margherita with fresh mozzarella and basil", required = false)
    private String description;

    @Schema(description = "Price of the product", example = "9.99", required = true)
    private BigDecimal price;
}
