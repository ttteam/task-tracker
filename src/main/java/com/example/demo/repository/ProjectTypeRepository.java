package com.example.demo.repository;

import com.example.demo.model.ProjectType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTypeRepository extends CrudRepository<ProjectType, Long> {
    ProjectType findProjectTypeById(Long id);
}
