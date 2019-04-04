package com.example.demo.dto;

import com.example.demo.model.Issue;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class IssuePriorityDto {
    @Null
    private Long id;

    @NotNull
    private String issuePriorityName;
}