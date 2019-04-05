package com.example.demo.service;

import com.example.demo.model.ParameterValue;

public interface ParameterValueService {
    ParameterValue saveParameterValue(ParameterValue parameterValue);
    ParameterValue getParameterValueById(String id);
    Iterable<ParameterValue> getAllParameterValues();
    void deleteParameterValue(String id);
}
