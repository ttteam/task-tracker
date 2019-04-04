package com.example.demo.service.impl;

import com.example.demo.model.Issue;
import com.example.demo.repository.IssueRepository;
import com.example.demo.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueServiceImpl implements IssueService {

    private IssueRepository repository;

    @Autowired
    public IssueServiceImpl(IssueRepository repository) {
        this.repository = repository;
    }

    @Override
    public Issue saveIssue(Issue issue) {
        return repository.save(issue);
    }

    @Override
    public Issue getIssueById(Long id) {
        return repository.findIssueById(id);
    }

    @Override
    public Iterable<Issue> getAllIssues() {
        return repository.findAll();
    }

    @Override
    public void deleteIssue(Long id) {
        repository.deleteById(id);
    }
}
