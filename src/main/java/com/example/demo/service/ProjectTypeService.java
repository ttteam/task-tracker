package com.example.demo.service;

import com.example.demo.model.ProjectType;

public interface ProjectTypeService {
    ProjectType saveProjectType(ProjectType projectType);
    ProjectType getProjectTypeById(Long id);
    Iterable<ProjectType> getAllProjectTypes();
    void deleteProjectType(Long id);
}
