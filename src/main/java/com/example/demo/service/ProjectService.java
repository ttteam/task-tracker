package com.example.demo.service;

import com.example.demo.model.Project;

import java.util.List;

public interface ProjectService {
    Project saveProject(Project project);
    Project getProjectById(String id);
    List<Project> getAllProjects();
    void deleteProject(String id);
}
