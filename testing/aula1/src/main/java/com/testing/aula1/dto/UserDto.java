package com.testing.aula1.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @Min(value = 18)
    private int age;
}
