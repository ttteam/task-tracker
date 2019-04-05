package com.example.demo.service;

import com.example.demo.model.IssuePriority;

import java.util.List;

public interface IssuePriorityService {
    IssuePriority saveIssuePriority(IssuePriority issuePriority);
    IssuePriority getIssuePriorityById(String id);
    List<IssuePriority> getAllIssuePriorities();
    void deleteIssuePriority(String id);
}
