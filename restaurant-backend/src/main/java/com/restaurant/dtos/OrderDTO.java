package com.restaurant.dtos;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO
{
    private String orderStatus;
    private String deliveryAddress;
    private UserDTO customer;
    private List<OrderEntryDTO> entries;
}
