package com.SDC.designPattern2.factory;

import com.SDC.designPattern2.model.CreditApplication;

public abstract class ApplicationFactory {
    public abstract CreditApplication createApplication();
}