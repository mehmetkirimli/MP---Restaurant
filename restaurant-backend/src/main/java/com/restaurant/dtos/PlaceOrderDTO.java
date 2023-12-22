package com.restaurant.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceOrderDTO
{
    @Schema(description = "Identifier of the cart for placing an order", required = true)
    private Long cartId;
}
