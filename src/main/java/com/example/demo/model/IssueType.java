package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "issuetype", schema = "new_schema")
@Getter
@Setter
public class IssueType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String issueTypeName;

    public IssueType(){}

}
