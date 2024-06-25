package com.SDC.designPattern2.model;

public class PersonalLoanApplication extends CreditApplication {
    @Override
    public void process() {
        setStatus("Processed: Personal Loan Application");
    }
}