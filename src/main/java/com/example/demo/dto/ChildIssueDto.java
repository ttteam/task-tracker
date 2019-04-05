package com.example.demo.dto;

import com.example.demo.model.IssueStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Date;

@Getter
@Setter
public class ChildIssueDto {
    @Null
    private String id;

    @NotNull
    private String childIssueName;

    @NotNull
    private String childIssueDescription;

    @NotNull
    @DateTimeFormat
    private Date childIssueStartDate;

    @NotNull
    @DateTimeFormat
    private Date childIssueDueDate;

    @NotNull
    private IssueStatus issueStatus;

}
