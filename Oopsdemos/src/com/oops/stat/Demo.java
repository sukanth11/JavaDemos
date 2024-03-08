package com.oops.stat;

public class Demo {
    static {
        System.out.println("in static");
    }
    public static void main(String[] args) {
        System.out.println("main demo");
        try{
            Class.forName("com.oops.stat.Trail");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Trail.getmessage();
        System.out.println(Trail.x+Trail.y);
    }
}
