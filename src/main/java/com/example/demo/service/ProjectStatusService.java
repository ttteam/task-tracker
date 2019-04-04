package com.example.demo.service;

import com.example.demo.model.ProjectStatus;

public interface ProjectStatusService {
    ProjectStatus saveProjectStatus(ProjectStatus projectStatus);
    ProjectStatus getProjectStatusById(Long id);
    Iterable<ProjectStatus> getAllProjectStatuses();
    void deleteProjectStatus(Long id);
}
