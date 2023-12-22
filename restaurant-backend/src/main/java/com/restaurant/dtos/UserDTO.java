package com.restaurant.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO
{
    @Schema(description = "Full name of the user", example = "John Doe")
    private String name;

    @Schema(description = "Email address of the user", example = "johndoe@example.com", required = true)
    private String email;

    @Schema(description = "Home address of the user", example = "123 Main Street, Anytown, USA")
    private String address;
}
