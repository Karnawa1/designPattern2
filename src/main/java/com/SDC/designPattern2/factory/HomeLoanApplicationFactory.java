package com.SDC.designPattern2.factory;

import com.SDC.designPattern2.model.CreditApplication;
import com.SDC.designPattern2.model.HomeLoanApplication;

public class HomeLoanApplicationFactory extends ApplicationFactory {
    @Override
    public CreditApplication createApplication() {
        return new HomeLoanApplication();
    }
}