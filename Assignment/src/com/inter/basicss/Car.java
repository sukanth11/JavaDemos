package com.inter.basicss;

public class Car extends Vehicle implements Iexternal,Iinternal{
    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void showacceess() {
        System.out.println("showaccess");
    }

    @Override
    public void exterior() {
        System.out.println("exterior");
    }

    @Override
    public void insurancedetails() {
        System.out.println("insurance");
    }

    @Override
    public void interior() {
        System.out.println("interior");
    }

    @Override
    void getmileage() {
        System.out.println("getmileage");
    }
    void show(){
        if(type.equals("xuv"))
            System.out.println("sports car");
        else
            System.out.println("normal car");
    }
}
