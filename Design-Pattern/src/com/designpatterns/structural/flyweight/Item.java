package com.designpatterns.structural.flyweight;

// Instances of Items will be the flyweights. Everything here is final and Immutable.
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
