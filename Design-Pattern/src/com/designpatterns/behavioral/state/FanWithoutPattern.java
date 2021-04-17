package com.designpatterns.behavioral.state;

public class FanWithoutPattern {

    final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2;

    int state = OFF;

    public void pullChain() {
        if(state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if(state == LOW) {
            System.out.println("Turning fan to Med.");
            state = MED;
        } else if(state == MED) {
            System.out.println("Turning fan to off.");
            state = OFF;
        }
    }
}
