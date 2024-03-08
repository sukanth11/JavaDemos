package com.inter.basicss;

public abstract class Vehicle implements Iinsurance {
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    abstract void getmileage();
    void getdetails(){
        System.out.println("brand"+brand);
        System.out.println("model"+model);
        System.out.println("price"+price);
    }

}
