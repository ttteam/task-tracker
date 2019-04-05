package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserServiceImpl implements UserService {
    @Bean
    public BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User saveUser(User user) {
        User temp = repository.findByUsername(user.getLogin());
        if (user.getId() != null || temp == null) {
            String newPass = bcryptEncoder.encode(user.getPassword());
            user.setPassword(newPass);

            return repository.save(user);
        } else return null;
    }

    @Override
    public User getUserById(String id) {
        return repository.findUserById(id);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }


    @Override
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
