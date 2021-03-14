package com.designpatterns.behavioral.chainofresponsibility;

public class Director extends Handler{
    @Override
    public void handlerRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handlerRequest(request);
        }
    }
}
