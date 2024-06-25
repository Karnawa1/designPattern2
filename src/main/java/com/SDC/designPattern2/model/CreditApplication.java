package com.SDC.designPattern2.model;

public abstract class CreditApplication {
    protected String applicantName;
    protected double amount;
    protected String status;

    public String getApplicantName() { return applicantName; }
    public void setApplicantName(String applicantName) { this.applicantName = applicantName; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public abstract void process();
}