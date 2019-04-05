package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(String id);
    Iterable<User> getAllUsers();
    void deleteUser(String id);
}
