package com.example.demo.controller;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private RoleService roleService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "/{id}")
    public RoleDto getRoleById(@PathVariable(name = "id") String id) {
        return modelMapper.map(roleService.getRoleById(id), RoleDto.class);
    }

    @GetMapping(value = "/all")
    public List<RoleDto> getAllRoles() {
        List<RoleDto> rolesDto = new ArrayList<>();
        List<Role> roles = roleService.getAllRoles();
        for(Role item : roles) {
            rolesDto.add(modelMapper.map(item, RoleDto.class));
        }
        return rolesDto;
    }

    @PostMapping
    public Role saveRole(@RequestBody Role account) {
        return roleService.saveRole(account);
    }

    @PutMapping
    public RoleDto updateRole(@RequestBody RoleDto accountForUpdate) {
        Role role = modelMapper.map(roleService.getRoleById(accountForUpdate.getId()), Role.class);
        return modelMapper.map(roleService.updateRole(role), RoleDto.class);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteRole(@PathVariable(name = "id") String id) {
        roleService.deleteRole(id);
        return ResponseEntity.noContent().build();
    }
}
