package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "projecttype", schema = "new_schema")
@Getter
@Setter
public class ProjectType {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameOfPT;

    @OneToMany(mappedBy = "projecttype")
    private Set<Project> project = new HashSet<>();

    public ProjectType(){

    }

    public ProjectType(Long id, String nameOfPT, Set<Project> project) {
        this.id = id;
        this.nameOfPT = nameOfPT;
        this.project = project;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProjectType that = (ProjectType) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameOfPT, that.nameOfPT) &&
                Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfPT, project);
    }
}
