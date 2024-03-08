package com.threads.basics;

public class Booking {

    public double booktickets(String name, int noofTickets) {
        double costperticket = 400;
        System.out.println("Booked tickets for " + name);
        double totalprice = costperticket * noofTickets;
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("total " + totalprice);
        return totalprice;
    }
}
