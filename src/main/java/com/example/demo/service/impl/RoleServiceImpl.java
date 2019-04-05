package com.example.demo.service.impl;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository repository;

    @Autowired
    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Role saveRole(Role role) {
        return repository.save(role);
    }

    @Override
    public Role getRoleById(String id) {
        return repository.findRoleById(id);
    }

    @Override
    public Iterable<Role> getAllRoles() {
        return repository.findAll();
    }

    @Override
    public void deleteRole(String id) {
        repository.deleteById(id);
    }
}
