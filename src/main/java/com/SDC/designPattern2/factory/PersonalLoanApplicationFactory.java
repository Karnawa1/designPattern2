package com.SDC.designPattern2.factory;

import com.SDC.designPattern2.model.CreditApplication;
import com.SDC.designPattern2.model.PersonalLoanApplication;

public class PersonalLoanApplicationFactory extends ApplicationFactory {
    @Override
    public CreditApplication createApplication() {
        return new PersonalLoanApplication();
    }
}
