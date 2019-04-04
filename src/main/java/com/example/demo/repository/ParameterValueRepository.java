package com.example.demo.repository;

import com.example.demo.model.ParameterValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterValueRepository extends CrudRepository<ParameterValue, Long> {
    ParameterValue findParameterValueById(Long id);
}
