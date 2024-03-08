package com.object.atm1;

public class Savings extends Account {

    public Savings(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("balance " + balance);
    }

    void deposit(double amount1, int intrest) {
        balance+=amount1+intrest;
        System.out.println("balance "+balance);
    }
}
