package com.SDC.designPattern2.mediator;

import com.SDC.designPattern2.model.CreditApplication;

import java.util.ArrayList;
import java.util.List;

public class BankSystemMediator implements Mediator {
    private List<CreditApplication> applications = new ArrayList<>();

    @Override
    public void notify(CreditApplication application, String event) {
        if (event.equals("submit")) {
            application.process();
            applications.add(application);
        }
    }

    public List<CreditApplication> getApplications() {
        return applications;
    }
}
