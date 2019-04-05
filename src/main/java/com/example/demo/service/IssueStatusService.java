package com.example.demo.service;

import com.example.demo.model.IssueStatus;

import java.util.List;

public interface IssueStatusService {
    IssueStatus saveIssueStatus(IssueStatus issueStatus);
    IssueStatus getIssueStatusById(String id);
    List<IssueStatus> getAllIssueStatuses();
    void deleteIssueStatus(String id);
}
