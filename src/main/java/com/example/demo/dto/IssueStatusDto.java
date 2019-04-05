package com.example.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class IssueStatusDto {
    @Null
    private String id;
    @NotNull
    private String issueStatusName;
}
