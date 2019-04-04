package com.example.demo.service;

import com.example.demo.model.IssueStatus;

public interface IssueStatusService {
    IssueStatus saveIssueStatus(IssueStatus issueStatus);
    IssueStatus getIssueStatusById(Long id);
    Iterable<IssueStatus> getAllIssueStatuses();
    void deleteIssueStatus(Long id);
}
