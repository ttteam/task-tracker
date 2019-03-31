package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.Set;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);
    Iterable<User> getAllUsers();
    Set getAuthority(User user);
    void deleteUser(Long id);
}
