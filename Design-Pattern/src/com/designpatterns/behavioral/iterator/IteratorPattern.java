package com.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        BikeRepository repository = new BikeRepository();

        repository.addBike("Bike1");
        repository.addBike("Bike2");
        repository.addBike("Bike3");
        repository.addBike("Bike4");

        Iterator<String> bikeIterator = repository.iterator();

//        while(bikeIterator.hasNext()) {
//            System.out.println(bikeIterator.next());
//        }

        for (String name: repository) {
            System.out.println(name);
        }
    }
}
