package com.example.demo.service;

import com.example.demo.model.IssueRole;

public interface IssueRoleService {
    IssueRole saveIssueRole(IssueRole issueRole);
    IssueRole getIssueRoleById(String id);
    Iterable<IssueRole> getAllIssueRoles();
    void deleteIssueRole(String id);
}
