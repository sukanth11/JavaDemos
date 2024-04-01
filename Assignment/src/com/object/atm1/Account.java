package com.object.atm1;

public class Account {
    double balance;

    public Account(double balance) {

        this.balance = balance;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}
