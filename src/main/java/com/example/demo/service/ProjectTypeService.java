package com.example.demo.service;

import com.example.demo.model.ProjectType;

public interface ProjectTypeService {
    ProjectType saveProjectType(ProjectType projectType);
    ProjectType getProjectTypeById(String id);
    Iterable<ProjectType> getAllProjectTypes();
    void deleteProjectType(String id);
}
