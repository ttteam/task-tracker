package com.example.demo.service;

import com.example.demo.model.IssueStatus;

public interface IssueStatusService {
    IssueStatus saveIssueStatus(IssueStatus issueStatus);
    IssueStatus getIssueStatusById(String id);
    Iterable<IssueStatus> getAllIssueStatuses();
    void deleteIssueStatus(String id);
}
