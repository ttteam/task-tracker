package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
    public UserDto getUserById(@PathVariable(name = "id") String id) {
        return modelMapper.map(userService.getUserById(id), UserDto.class);
    }

    @GetMapping(value = "/all")
    public List<UserDto> getAllUsers() {
        List<UserDto> usersDto = new ArrayList<>();
        List<User> users = userService.getAllUsers();
        for(User item : users) {
            usersDto.add(modelMapper.map(item, UserDto.class));
        }
        return usersDto;
    }

    @PostMapping
    public User saveUser(@RequestBody User account) {
        return userService.saveUser(account);
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto accountForUpdate) {
        User user = modelMapper.map(userService.getUserById(accountForUpdate.getId()), User.class);
        return modelMapper.map(userService.updateUser(user), UserDto.class);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable(name = "id") String id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
