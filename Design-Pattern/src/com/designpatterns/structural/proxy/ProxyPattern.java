package com.designpatterns.structural.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeLine("Hello"));

        service.postToTimeline("Hello", "Shouldn't go through");
    }
}
