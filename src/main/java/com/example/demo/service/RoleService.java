package com.example.demo.service;

import com.example.demo.model.Role;

import java.util.Optional;

public interface RoleService {
    Role saveRole(Role role);
    Role getRoleById(String id);
    Iterable<Role> getAllRoles();
    void deleteRole(String id);
}
