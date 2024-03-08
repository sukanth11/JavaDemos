package com.oops.overloading;

public class Shape {
    void calarea(int length)
    {
        System.out.println("sq "+(length*length));
    }
    int calarea(int length,int breath)
    {
        return length*breath;
    }
    void calarea(double radius)
    {
        System.out.println("circle "+Math.PI*Math.pow(radius,2));
    }
    double calarea(double base,int height)
    {
        return (0.5*base*height);
    }
}
