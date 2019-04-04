package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "issuepriority", schema = "new_schema")
@Getter
@Setter
public class IssuePriority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String issuePriorityName;

    public IssuePriority(){

    }
}
