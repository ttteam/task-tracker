package com.example.demo.service;

import com.example.demo.model.IssuePriority;

public interface IssuePriorityService {
    IssuePriority saveIssuePriority(IssuePriority issuePriority);
    IssuePriority getIssuePriorityById(String id);
    Iterable<IssuePriority> getAllIssuePriorities();
    void deleteIssuePriority(String id);
}
