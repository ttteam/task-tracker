package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/{id}")
    public UserDto getUserById(Long id) {
        return modelMapper.map(userService.getUserById(id), UserDto.class);
    }

    @GetMapping(value = "/all")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveUser(User account) {
        return modelMapper.map(userService.saveUser(account), User.class);
//        return userService.saveUser(account);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteUser(Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
