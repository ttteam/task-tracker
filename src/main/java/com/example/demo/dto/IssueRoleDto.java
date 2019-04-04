package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Setter
@Getter
public class IssueRoleDto {
    @Null
    private Long id;

    @NotNull
    private String issueRoleName;
}
