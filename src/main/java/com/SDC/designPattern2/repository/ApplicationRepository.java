package com.SDC.designPattern2.repository;

import com.SDC.designPattern2.model.CreditApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationRepository {
    private List<CreditApplication> applications = new ArrayList<>();

    public void addApplication(CreditApplication application) {
        applications.add(application);
    }

    public List<CreditApplication> findApplicationsByStatus(String status) {
        return applications.stream()
                .filter(app -> app.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<CreditApplication> getAllApplications() {
        return applications;
    }
}
