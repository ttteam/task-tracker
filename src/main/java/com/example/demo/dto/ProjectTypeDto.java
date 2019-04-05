package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Getter
@Setter
public class ProjectTypeDto {
    @Null
    private String id;

    @NotNull
    private String projectTypeDto;
}
