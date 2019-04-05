package com.example.demo.service;

import com.example.demo.model.Dashboard;

public interface DashboardService {
    Dashboard saveDashboard(Dashboard dashboard);
    Dashboard getDashboardById(String id);
    Iterable<Dashboard> getAllDashboards();
    void deleteDashboard(String id);
}
