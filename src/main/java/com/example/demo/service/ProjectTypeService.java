package com.example.demo.service;

import com.example.demo.model.ProjectType;

import java.util.List;

public interface ProjectTypeService {
    ProjectType saveProjectType(ProjectType projectType);
    ProjectType getProjectTypeById(String id);
    List<ProjectType> getAllProjectTypes();
    void deleteProjectType(String id);
}
