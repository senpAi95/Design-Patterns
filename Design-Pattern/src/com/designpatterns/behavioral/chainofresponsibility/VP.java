package com.designpatterns.behavioral.chainofresponsibility;

public class VP extends Handler{
    @Override
    public void handlerRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            if(request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
                return;
            }
            successor.handlerRequest(request);
        }
    }
}
