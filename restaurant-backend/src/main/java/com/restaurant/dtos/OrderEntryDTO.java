package com.restaurant.dtos;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderEntryDTO
{
    private ProductDTO product;
    private int quantity;
    private BigDecimal totalPrice;
}
