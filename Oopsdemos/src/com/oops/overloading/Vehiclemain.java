package com.oops.overloading;

public class Vehiclemain {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Vehicle vehicle1=new Vehicle("BMW");
        Vehicle vehicle2=new Vehicle("audi","audi123");
        Vehicle vehicle3=new Vehicle("shift",200000,"shift123");
        vehicle.getdetails();
        System.out.println("----------");
        vehicle1.getdetails();
        System.out.println("----------");
        vehicle2.getdetails();
        System.out.println("----------");
        vehicle3.getdetails();
        System.out.println("----------");
    }
}
