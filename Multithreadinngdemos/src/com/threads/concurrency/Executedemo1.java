package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executedemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(() -> {
            System.out.println("doing pollinhg");
            Greeting greet = new Greeting();
            System.out.println(greet.sayHello("sukanth"));
        });
        executorService.execute(() -> {
            System.out.println("extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.booktickets("sukanth", 20));
        });
        executorService.execute(() -> {
            System.out.println("reading from database");
        });
    }
}
