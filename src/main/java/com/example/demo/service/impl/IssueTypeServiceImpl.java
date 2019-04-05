package com.example.demo.service.impl;

import com.example.demo.model.IssueType;
import com.example.demo.repository.IssueTypeRepository;
import com.example.demo.service.IssueTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueTypeServiceImpl implements IssueTypeService {

    private IssueTypeRepository repository;

    @Autowired
    public IssueTypeServiceImpl(IssueTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public IssueType saveIssueType(IssueType issueType) {
        return repository.save(issueType);
    }

    @Override
    public IssueType getIssueTypeById(String id) {
        return repository.findIssueTypeById(id);
    }

    @Override
    public Iterable<IssueType> getAllIssueTypes() {
        return repository.findAll();
    }

    @Override
    public void deleteIssueType(String id) {
        repository.deleteById(id);
    }
}
