package com.SDC.designPattern2.mediator;

import com.SDC.designPattern2.model.CreditApplication;

public interface Mediator {
    void notify(CreditApplication application, String event);
}
