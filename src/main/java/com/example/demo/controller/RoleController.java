package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "/{id}")
    public Role getRoleById(Long id) {
        return roleService.getRoleById(id);
    }

    @GetMapping(value = "/all")
    public Iterable<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public Role saveRole(Role account) {
        return roleService.saveRole(account);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteRole(Long id) {
        roleService.deleteRole(id);
        return ResponseEntity.noContent().build();
    }

}
