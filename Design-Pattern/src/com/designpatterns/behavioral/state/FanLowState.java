package com.designpatterns.behavioral.state;

public class FanLowState implements State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to Med.");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is in Low.";
    }
}
