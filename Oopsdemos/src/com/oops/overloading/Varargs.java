package com.oops.overloading;

public class Varargs {
    void calsum(String name,int... marks){
        System.out.println("welcome "+name);
        int sum=0;
        for (int mark:marks){
            sum+=mark;
        }
        System.out.println("sum-"+sum);
    }
    void calsum(String name){
        System.out.println("hello "+name);
    }

}
