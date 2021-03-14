package com.designpatterns.structural.proxy;

public class TwitterServiceStub implements TwitterService{
    @Override
    public String getTimeLine(String screenName) {
        return "My timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message);
    }
}
