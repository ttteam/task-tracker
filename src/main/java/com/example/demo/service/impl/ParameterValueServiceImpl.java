package com.example.demo.service.impl;

import com.example.demo.model.ParameterValue;
import com.example.demo.repository.ParameterValueRepository;
import com.example.demo.service.ParameterValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParameterValueServiceImpl implements ParameterValueService {

    private ParameterValueRepository repository;

    @Autowired
    public ParameterValueServiceImpl(ParameterValueRepository repository) {
        this.repository = repository;
    }

    @Override
    public ParameterValue saveParameterValue(ParameterValue parameterValue) {
        return repository.save(parameterValue);
    }

    @Override
    public ParameterValue getParameterValueById(Long id) {
        return repository.findParameterValueById(id);
    }

    @Override
    public Iterable<ParameterValue> getAllParameterValues() {
        return repository.findAll();
    }

    @Override
    public void deleteParameterValue(Long id) {
        repository.deleteById(id);
    }
}
