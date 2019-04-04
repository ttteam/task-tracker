package com.example.demo.service.impl;

import com.example.demo.model.ProjectType;
import com.example.demo.repository.ProjectTypeRepository;
import com.example.demo.service.ProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTypeServiceImpl implements ProjectTypeService {

    private ProjectTypeRepository repository;

    @Autowired
    public ProjectTypeServiceImpl(ProjectTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProjectType saveProjectType(ProjectType projectType) {
        return repository.save(projectType);
    }

    @Override
    public ProjectType getProjectTypeById(Long id) {
        return repository.findProjectTypeById(id);
    }

    @Override
    public Iterable<ProjectType> getAllProjectTypes() {
        return repository.findAll();
    }

    @Override
    public void deleteProjectType(Long id) {
        repository.deleteById(id);
    }
}