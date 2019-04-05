package com.example.demo.service;

import com.example.demo.model.Filter;

import java.util.List;

public interface FilterService {
    Filter saveFilter(Filter filter);
    Filter getFilterById(String id);
    List<Filter> getAllFilters();
    void deleteFilter(String id);
}
