package com.designpatterns.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
