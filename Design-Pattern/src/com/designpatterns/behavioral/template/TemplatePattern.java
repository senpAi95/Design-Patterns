package com.designpatterns.behavioral.template;

public class TemplatePattern {
    public static void main(String[] args) {
        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        // StoreOrder
    }
}
