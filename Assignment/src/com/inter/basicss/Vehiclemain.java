package com.inter.basicss;

public class Vehiclemain {
    public static void main(String[] args) {
        Vehicle car=new Car("xuv","xuv500",1500000,"xuv");
        car.getdetails();
        car.getmileage();
        car.insurancedetails();


        Iinsurance  iinsurance=new Car("audi","audi123",5000000,"audi");
        iinsurance.insurancedetails();

        Iaccessories iaccessories=(Iaccessories) car;
//        iaccessories.interior();

        Vehicle  bike=new Bike("duke","duke12",200000,350);
        bike.getdetails();
        bike.getmileage();
        bike.insurancedetails();
    }
}
