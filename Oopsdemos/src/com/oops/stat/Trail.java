package com.oops.stat;

public class Trail {
    static int x;
    static int y=10;
    static {
        System.out.println("in static block block1");
        x=100;
    }
    static {
        System.out.println("in static block block1");
        x=100;
    }
    static void getmessage(){
        System.out.println("in static method");
        System.out.println("sum " +(x+y));
    }
    public static void main(String[] args){
        System.out.println("in main");
        getmessage();
        System.out.println("sum "+(x+y));

    }
}
