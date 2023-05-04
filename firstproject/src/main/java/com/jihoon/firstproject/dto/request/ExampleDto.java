package com.jihoon.firstproject.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Data
public class ExampleDto {
    @NotBlank
    private String parameter1;
    @Length(min = 0, max = 20)
    private String parameter2;
    private String parameter3;
}
