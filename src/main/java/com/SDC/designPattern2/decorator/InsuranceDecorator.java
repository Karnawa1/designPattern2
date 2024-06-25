package com.SDC.designPattern2.decorator;

import com.SDC.designPattern2.model.CreditApplication;

public class InsuranceDecorator extends ApplicationDecorator {
    public InsuranceDecorator(CreditApplication decoratedApplication) {
        super(decoratedApplication);
    }

    @Override
    public void process() {
        decoratedApplication.process();
        addInsurance();
    }

    private void addInsurance() {
        setStatus(getStatus() + " with Insurance");
    }
}
