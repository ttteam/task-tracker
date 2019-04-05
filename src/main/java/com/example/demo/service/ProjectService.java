package com.example.demo.service;

import com.example.demo.model.Project;

public interface ProjectService {
    Project saveProject(Project project);
    Project getProjectById(String id);
    Iterable<Project> getAllProjects();
    void deleteProject(String id);
}
