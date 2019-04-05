package com.example.demo.service.impl;

import com.example.demo.config.JwtTokenUtil;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

    private UserRepository repository;

    private final BCryptPasswordEncoder bcryptEncoder;

    private final JwtTokenUtil jwtTokenUtil;

    private RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository repository, BCryptPasswordEncoder bcryptEncoder, JwtTokenUtil jwtTokenUtil) {
        this.repository = repository;
        this.bcryptEncoder = bcryptEncoder;
        this.jwtTokenUtil = jwtTokenUtil;
        this.roleService = roleService;
    }

    @Override
    public User saveUser(User user) {
        User temp = repository.findByUsername(user.getUsername());
        if (user.getId() != null || temp == null) {
            String newPass = bcryptEncoder.encode(user.getPassword());
            user.setPassword(newPass);

            Set role = new HashSet<Role>(1);
            role.add(roleService.getRoleById(1L));
            user.setRoles(role);

            return repository.save(user);
        } else return null;
    }

    @Override
    public User getUserById(Long id) {
        return repository.findUserById(id);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }


    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getUserByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("Invalid username or password.");
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
    }

    @Override
    public User getUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Set getAuthority(User user) {
        Set<GrantedAuthority> authorities = new HashSet<>();

        for (Role role: user.getRoles()
             ) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }


        return authorities;
    }

}
