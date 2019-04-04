package com.example.demo.service.impl;

import com.example.demo.model.IssueRole;
import com.example.demo.repository.IssueRoleRepository;
import com.example.demo.service.IssueRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueRoleServiceImpl implements IssueRoleService {

    private IssueRoleRepository issueRoleRepository;

    @Autowired
    public IssueRoleServiceImpl(IssueRoleRepository issueRoleRepository) {
        this.issueRoleRepository = issueRoleRepository;
    }

    @Override
    public IssueRole saveIssueRole(IssueRole issueRole) {
        return null;
    }

    @Override
    public IssueRole getIssueRoleById(Long id) {
        return null;
    }

    @Override
    public Iterable<IssueRole> getAllIssueRoles() {
        return null;
    }

    @Override
    public void deleteIssueRole(Long id) {

    }
}
