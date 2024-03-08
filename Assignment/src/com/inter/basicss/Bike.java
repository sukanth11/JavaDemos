package com.inter.basicss;

public class Bike extends Vehicle implements Iinsurance{
    int capacity;

    public Bike(String brand, String model, double price, int capacity) {
        super(brand, model, price);
        this.capacity = capacity;
    }

    @Override
    public void insurancedetails() {
        System.out.println("insurancedetails");
    }

    @Override
    void getmileage() {
        System.out.println("getmileage");
    }
    void  showtype(){
        if (capacity>=300)
            System.out.println("sports bike");
        else
            System.out.println("normal bike");
    }
}
