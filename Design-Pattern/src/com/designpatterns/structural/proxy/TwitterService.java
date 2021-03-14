package com.designpatterns.structural.proxy;

public interface TwitterService {
    public String getTimeLine(String screenName);
    public void postToTimeline(String screenName, String message);
}
