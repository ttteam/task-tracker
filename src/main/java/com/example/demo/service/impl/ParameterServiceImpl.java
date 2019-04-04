package com.example.demo.service.impl;

import com.example.demo.model.Parameter;
import com.example.demo.repository.ParameterRepository;
import com.example.demo.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParameterServiceImpl implements ParameterService {

    private ParameterRepository repository;

    @Autowired
    public ParameterServiceImpl(ParameterRepository repository) {
        this.repository = repository;
    }

    @Override
    public Parameter saveParameter(Parameter parameter) {
        return repository.save(parameter);
    }

    @Override
    public Parameter getParameterById(Long id) {
        return repository.findParameterById(id);
    }

    @Override
    public Iterable<Parameter> getAllParameters() {
        return repository.findAll();
    }

    @Override
    public void deleteParameter(Long id) {
        repository.deleteById(id);
    }
}
