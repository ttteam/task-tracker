package com.example.demo.service;

import com.example.demo.model.Dashboard;

public interface DashboardService {
    Dashboard saveDashboard(Dashboard dashboard);
    Dashboard getDashboardById(Long id);
    Iterable<Dashboard> getAllDashboards();
    void deleteDashboard(Long id);
}
