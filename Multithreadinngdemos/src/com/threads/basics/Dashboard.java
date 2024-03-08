package com.threads.basics;

public class Dashboard {
    public static void main(String[] args) {
        Booking booking=new Booking();
        Counter counter=new Counter("sukanth",10,booking);
        Counter counter1=new Counter("kavya",5,booking);
        Counter counter2=new Counter("kishor",8,booking);
    }
}
