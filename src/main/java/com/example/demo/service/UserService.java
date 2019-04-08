package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    User getUserById(String id);
    User getUserByLogin(String login);
    List<User> getAllUsers();
    void deleteUser(String id);
}
