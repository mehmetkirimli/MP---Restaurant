package com.restaurant.dtos;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoryDTO {

    @Schema(description = "Name of the category", example = "Beverages")
    private String name;

    @ArraySchema(schema = @Schema(description = "List of products in this category", implementation = CategoryProductDTO.class))
    private List<CategoryProductDTO> products;

}

