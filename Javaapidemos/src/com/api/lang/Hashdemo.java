package com.api.lang;

import com.api.lang.Vehicle;

public class Hashdemo {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("black","Audi","x100");
        Vehicle vehicle2=new Vehicle("white","Audi","x100");
        Vehicle vehicle3=new Vehicle("white","Audi","a100");
        Vehicle vehicle4=new Vehicle("black","Audi","x100");

        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));

        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());

    }
}
