package com.example.demo.service.impl;

import com.example.demo.model.Profile;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository repository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public Profile saveProfile(Profile profile) {
        return repository.save(profile);
    }

    @Override
    public Profile getProfileById(Long id) {
        return repository.findProfileById(id);
    }

    @Override
    public Iterable<Profile> getAllProfiles() {
        return repository.findAll();
    }

    @Override
    public void deleteProfile(Long id) {
        repository.deleteById(id);
    }
}
