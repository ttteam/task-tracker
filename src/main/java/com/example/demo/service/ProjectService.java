package com.example.demo.service;

import com.example.demo.model.Project;

public interface ProjectService {
    Project saveProject(Project project);
    Project getProjectById(Long id);
    Iterable<Project> getAllProjects();
    void deleteProject(Long id);
}
