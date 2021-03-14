package com.designpatterns.structural.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        // not building on constructors, but adding functionality on the objects. simlar to File reading streams in java.
        Sandwich sandwich = new DressingDecorator(new MeatDecorator( new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
