package com.example.demo.service;

import com.example.demo.model.Profile;

public interface ProfileService {
    Profile saveProfile(Profile profile);
    Profile getProfileById(String id);
    Iterable<Profile> getAllProfiles();
    void deleteProfile(String id);
}
