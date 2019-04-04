package com.example.demo.repository;

import com.example.demo.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {
    Profile findProfileById(Long id);
}
