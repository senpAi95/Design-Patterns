package com.designpatterns.behavioral.template;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Checking out.");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment done.");
    }

    @Override
    public void doReceipt() {
        System.out.println("Receipt generating.");
    }

    @Override
    public void doDelivery() {
        System.out.println("Delivering.");
    }
}
