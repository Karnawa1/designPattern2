package com.SDC.designPattern2.decorator;

import com.SDC.designPattern2.model.CreditApplication;

public abstract class ApplicationDecorator extends CreditApplication {
    protected CreditApplication decoratedApplication;

    public ApplicationDecorator(CreditApplication decoratedApplication) {
        this.decoratedApplication = decoratedApplication;
    }

    @Override
    public void process() {
        decoratedApplication.process();
    }

    @Override
    public String getApplicantName() {
        return decoratedApplication.getApplicantName();
    }

    @Override
    public void setApplicantName(String applicantName) {
        decoratedApplication.setApplicantName(applicantName);
    }

    @Override
    public double getAmount() {
        return decoratedApplication.getAmount();
    }

    @Override
    public void setAmount(double amount) {
        decoratedApplication.setAmount(amount);
    }

    @Override
    public String getStatus() {
        return decoratedApplication.getStatus();
    }

    @Override
    public void setStatus(String status) {
        decoratedApplication.setStatus(status);
    }
}
