package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "projectstatus", schema = "new_schema")
@Getter
@Setter
public class ProjectStatus {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String psName;

//    @OneToMany(mappedBy = "projectstatus")
//    private Set<ProjectDto> project = new HashSet<>();

    public ProjectStatus(){

    }

    public ProjectStatus(Long id, String psName) {
//    public ProjectStatus(Long id, String psName, Set<ProjectDto> project) {
        this.id = id;
        this.psName = psName;
//        this.project = project;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProjectStatus that = (ProjectStatus) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(psName, that.psName)
//                && Objects.equals(project, that.project)
                ;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id, psName, project);
        return Objects.hash(id, psName);
    }
}
