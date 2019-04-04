package com.example.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class IssueStatusDto {
    @Null
    private Long id;
    @NotNull
    private String issueStatusName;
}
