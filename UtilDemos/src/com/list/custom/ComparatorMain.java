package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(new Vehicle("xuv","xuv500",200000),
                                                new Vehicle("Audi","Audi200",500000),
                                                new Vehicle("honda","i20",1500000),
                                                new Vehicle("omni","omni100",300000));

        System.out.println("before sorting");
        for (Vehicle vehicle:vehicles)
            System.out.println(vehicle);


        System.out.println("after sorting");
        Collections.sort(vehicles,new Pricesort());
        for (Vehicle vehicle:vehicles)
            System.out.println(vehicle);
    }
}
