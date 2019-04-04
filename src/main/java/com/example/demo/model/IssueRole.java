package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "issuerole", schema = "new_schema")
@Getter
@Setter
public class IssueRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String issueRoleName;

    public IssueRole(){}

}
