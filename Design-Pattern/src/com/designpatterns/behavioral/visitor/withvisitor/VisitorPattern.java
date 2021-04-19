package com.designpatterns.behavioral.visitor.withvisitor;

public class VisitorPattern {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        // can add on visitors.
        order.accept(new AtvPartsDisplayVisitor());
    }
}
