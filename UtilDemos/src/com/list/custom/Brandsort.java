package com.list.custom;

import java.util.Comparator;

public class Brandsort implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
