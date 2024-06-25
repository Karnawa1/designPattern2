package com.SDC.designPattern2.decorator;

import com.SDC.designPattern2.model.CreditApplication;

public class FastTrackDecorator extends ApplicationDecorator {
    public FastTrackDecorator(CreditApplication decoratedApplication) {
        super(decoratedApplication);
    }

    @Override
    public void process() {
        decoratedApplication.process();
        fastTrack();
    }

    private void fastTrack() {
        setStatus(getStatus() + " with Fast Track");
    }
}
