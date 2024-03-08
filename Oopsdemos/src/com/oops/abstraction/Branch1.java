package com.oops.abstraction;

public class Branch1 extends Bank{
    @Override
    void carloan() {
        System.out.println("the car lone is 2000");
    }

    @Override
    void houselone() {
        System.out.println("the house lone is 4000");
    }

    @Override
    void educationlone() {
        System.out.println("the educationlone is  10000");
    }
    void payintrest(){
        System.out.println("payintrest");
    }
}
