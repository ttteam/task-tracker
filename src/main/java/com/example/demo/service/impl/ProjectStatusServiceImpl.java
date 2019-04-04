package com.example.demo.service.impl;

import com.example.demo.model.ProjectStatus;
import com.example.demo.repository.ProjectStatusRepository;
import com.example.demo.service.ProjectStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectStatusServiceImpl implements ProjectStatusService {

    private ProjectStatusRepository repository;

    @Autowired
    public ProjectStatusServiceImpl(ProjectStatusRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProjectStatus saveProjectStatus(ProjectStatus projectStatus) {
        return repository.save(projectStatus);
    }

    @Override
    public ProjectStatus getProjectStatusById(Long id) {
        return repository.findProjectStatusById(id);
    }

    @Override
    public Iterable<ProjectStatus> getAllProjectStatuses() {
        return repository.findAll();
    }

    @Override
    public void deleteProjectStatus(Long id) {
        repository.deleteById(id);
    }
}
