package com.oops.encapsulation;

public class Vehiclemain {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setModel("Audi102");
        vehicle.setBrand("Audi");
        vehicle.setPrice(20000.00);
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getPrice());
        System.out.println(vehicle.toString());
    }
}
