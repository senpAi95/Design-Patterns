package com.designpatterns.structural.flyweight;

public class FlyWeightPattern {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 123);
        inventorySystem.takeOrder("Bose", 234);
        inventorySystem.takeOrder("Samsung", 345);
        inventorySystem.takeOrder("LED", 456);
        inventorySystem.takeOrder("Roomba", 567);
        inventorySystem.takeOrder("Samsung", 678);
        inventorySystem.takeOrder("Samsung", 789);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
