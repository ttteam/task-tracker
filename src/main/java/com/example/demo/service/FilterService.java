package com.example.demo.service;

import com.example.demo.model.Filter;

public interface FilterService {
    Filter saveFilter(Filter filter);
    Filter getFilterById(String id);
    Iterable<Filter> getAllFilters();
    void deleteFilter(String id);
}
