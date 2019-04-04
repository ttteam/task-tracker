package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Dashboard", schema = "new_schema")
@Getter
@Setter
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dashboardName;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "dashboard_filter",
            joinColumns = @JoinColumn(name = "dashboardid"),
            inverseJoinColumns = @JoinColumn(name = "filterid")
    )
    private Set<Filter> filters = new HashSet<>();
    public Dashboard(){}
}
