package com.oops.inheritance;

public class Inmanager extends Inemployee {
    double salary;

    public Inmanager(String employeename, int employeeid, double salary) {
        super(employeename, employeeid);
        this.salary = salary;
    }

    void printbonus(double amount){
        System.out.println("bonus "+(amount=salary));
    }


}
