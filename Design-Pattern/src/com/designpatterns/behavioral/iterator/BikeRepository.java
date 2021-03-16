package com.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BikeRepository implements Iterable<String>{
    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if(index == bikes.length)
        {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }

        bikes[index++] = bike;

    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }
        };
        return iterator;
    }
}
