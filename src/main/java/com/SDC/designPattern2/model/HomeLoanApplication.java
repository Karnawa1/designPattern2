package com.SDC.designPattern2.model;

public class HomeLoanApplication extends CreditApplication {
    @Override
    public void process() {
        setStatus("Processed: Home Loan Application");
    }
}
