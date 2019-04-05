package com.example.demo.service;

import com.example.demo.model.ProjectStatus;

import java.util.List;

public interface ProjectStatusService {
    ProjectStatus saveProjectStatus(ProjectStatus projectStatus);
    ProjectStatus getProjectStatusById(String id);
    List<ProjectStatus> getAllProjectStatuses();
    void deleteProjectStatus(String id);
}
