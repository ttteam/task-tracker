package com.example.demo.dto;

import com.example.demo.model.Filter;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class DashboardDto {
    @Null
    private String id;

    @NotNull
    private String dashboardName;

    @NotNull
    private Set<Filter> filters = new HashSet<>();
}
