package com.example.demo.service;

import com.example.demo.model.ChildIssue;

public interface ChildIssueService {
    ChildIssue saveChildIssue(ChildIssue childIssue);
    ChildIssue getChildIssueById(Long id);
    Iterable<ChildIssue> getAllChildIssues();
    void deleteChildIssue(Long id);
}
