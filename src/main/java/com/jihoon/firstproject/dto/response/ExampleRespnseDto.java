package com.jihoon.firstproject.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
public class ExampleRespnseDto {
    private String data1;
    private String data2;
    private String data3;
}
