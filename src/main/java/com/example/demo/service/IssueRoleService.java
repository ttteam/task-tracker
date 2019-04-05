package com.example.demo.service;

import com.example.demo.model.IssueRole;

import java.util.List;

public interface IssueRoleService {
    IssueRole saveIssueRole(IssueRole issueRole);
    IssueRole getIssueRoleById(String id);
    List<IssueRole> getAllIssueRoles();
    void deleteIssueRole(String id);
}
