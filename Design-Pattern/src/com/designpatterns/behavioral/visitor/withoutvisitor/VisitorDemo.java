package com.designpatterns.behavioral.visitor.withoutvisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        System.out.println(order.calculateShipping());
    }
}
