package com.oops.overloading;

public class Shapemain {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.calarea(10);
        shape.calarea(2.00);
        int rect=shape.calarea(10,20);
        System.out.println("rectangle "+rect);
        double tri=shape.calarea(12.0,5);
        System.out.println("triangle "+tri);


    }
}
