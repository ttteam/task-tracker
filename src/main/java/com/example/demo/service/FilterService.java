package com.example.demo.service;

import com.example.demo.model.Filter;

public interface FilterService {
    Filter saveFilter(Filter filter);
    Filter getFilterById(Long id);
    Iterable<Filter> getAllFilters();
    void deleteFilter(Long id);
}
