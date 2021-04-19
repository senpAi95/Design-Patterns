package com.designpatterns.behavioral.visitor.withvisitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        shippingAmount += 14;
        System.out.println("Fenders are a bit old.");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 2;
        System.out.println("Oil Changed.");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 24;
        System.out.println("Expensive wheels.");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If more than 3 parts are bought, discount is applied on shipping.");
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size()>3) {
            shippingAmount -= 20;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
