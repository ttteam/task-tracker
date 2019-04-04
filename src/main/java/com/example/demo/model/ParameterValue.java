package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "parametervalues", schema = "new_schema")
@Getter
@Setter
public class ParameterValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "parameterId", referencedColumnName = "id")
    private Parameter parameter;

    public ParameterValue(){}

}
