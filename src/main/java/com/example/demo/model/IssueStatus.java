package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "issuestatus", schema = "new_schema")
@Getter
@Setter
public class IssueStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String issueStatusName;

    public IssueStatus(){}

}
