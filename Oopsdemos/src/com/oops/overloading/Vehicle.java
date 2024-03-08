package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        super();
        System.out.println("one");

        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");

        this.brand = brand;
        /*this.model = model;*/
    }

    public Vehicle(String brand, double price, String model) {
        this(brand, model);
        System.out.println("three");
        /*this.brand = brand;
        this.model = model;*/

        this.price = price;
    }
    void getdetails(){
        if (model!=null){
            System.out.println("model-"+model);
        }
        if (brand!=null){
            System.out.println("brand-"+brand);
        }
        if (price>0){
            System.out.println("price-" + price);
        }

    }
}
