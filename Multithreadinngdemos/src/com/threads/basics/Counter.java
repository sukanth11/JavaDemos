package com.threads.basics;

public class Counter implements Runnable{
    String name;
    int nooftickets;
    Booking booking;
    public Counter(String name, int nooftickets,Booking booking) {
        super();
        this.name=name;
        this.nooftickets=nooftickets;
        this.booking=booking;
        Thread thread=new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (booking) {
            System.out.println("welcome to bookmyshow " + name);
            double amount = booking.booktickets(name, nooftickets);
            System.out.println("Amount to be paid is " + amount);
        }
    }
}
