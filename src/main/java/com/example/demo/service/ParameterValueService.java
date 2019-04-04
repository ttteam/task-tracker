package com.example.demo.service;

import com.example.demo.model.ParameterValue;

public interface ParameterValueService {
    ParameterValue saveParameterValue(ParameterValue parameterValue);
    ParameterValue getParameterValueById(Long id);
    Iterable<ParameterValue> getAllParameterValues();
    void deleteParameterValue(Long id);
}
