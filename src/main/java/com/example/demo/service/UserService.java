package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(Long id);
    Iterable<User> getAllUsers();
    void deleteUser(Long id);
}
