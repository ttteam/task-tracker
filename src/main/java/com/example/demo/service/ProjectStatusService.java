package com.example.demo.service;

import com.example.demo.model.ProjectStatus;

public interface ProjectStatusService {
    ProjectStatus saveProjectStatus(ProjectStatus projectStatus);
    ProjectStatus getProjectStatusById(String id);
    Iterable<ProjectStatus> getAllProjectStatuses();
    void deleteProjectStatus(String id);
}
