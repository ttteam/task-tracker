package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "filter", schema = "new_schema")
@Getter
@Setter
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filterName;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "selectedvalue",
            joinColumns = @JoinColumn(name = "filterNameId"),
            inverseJoinColumns = @JoinColumn(name = "paramValueId")
    )
    private Set<ParameterValue> parametervalues = new HashSet<>();

    public Filter(){}
}
