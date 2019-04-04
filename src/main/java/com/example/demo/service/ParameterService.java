package com.example.demo.service;

import com.example.demo.model.Parameter;

public interface ParameterService {
    Parameter saveParameter(Parameter parameter);
    Parameter getParameterById(Long id);
    Iterable<Parameter> getAllParameters();
    void deleteParameter(Long id);
}
