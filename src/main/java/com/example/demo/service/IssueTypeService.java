package com.example.demo.service;

import com.example.demo.model.IssueType;

public interface IssueTypeService {
    IssueType saveIssueType(IssueType issueType);
    IssueType getIssueTypeById(String id);
    Iterable<IssueType> getAllIssueTypes();
    void deleteIssueType(String id);
}
