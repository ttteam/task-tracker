package com.example.demo.service;

import com.example.demo.model.Issue;

public interface IssueService {
    Issue saveIssue(Issue issue);
    Issue getIssueById(String id);
    Iterable<Issue> getAllIssues();
    void deleteIssue(String id);
}
