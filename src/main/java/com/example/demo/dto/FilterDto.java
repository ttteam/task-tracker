package com.example.demo.dto;

import com.example.demo.model.ParameterValue;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class FilterDto {
    @Null
    private String id;

    @NotNull
    private String filterName;

    @NotNull
    private Set<ParameterValue> parametervalues = new HashSet<>();
}
