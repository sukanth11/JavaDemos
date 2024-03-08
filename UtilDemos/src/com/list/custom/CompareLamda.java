package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLamda {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(new Vehicle("xuv","xuv500",200000),
                new Vehicle("Audi","Audi200",500000),
                new Vehicle("honda","i20",1500000),
                new Vehicle("omni","omni100",300000));

        System.out.println("before sorting");
        for (Vehicle vehicle:vehicles)
            System.out.println(vehicle);
        System.out.println("*********************");
        Collections.sort(vehicles,(Vehicle o1, Vehicle o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (Vehicle bvehicle:vehicles)
            System.out.println(bvehicle);
        System.out.println("*********************");
        Collections.sort(vehicles,(Vehicle o1, Vehicle o2)->o1.getModel().compareTo(o2.getModel()));
        for (Vehicle mvehicle:vehicles)
            System.out.println(mvehicle);
        System.out.println("*********************");
        Collections.sort(vehicles,(Vehicle o1, Vehicle o2)->((Double)o1.getPrice()).compareTo(o2.getPrice()));
        for (Vehicle pvehicle:vehicles)
            System.out.println(pvehicle);

    }
}
