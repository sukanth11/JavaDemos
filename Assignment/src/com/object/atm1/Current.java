package com.object.atm1;

public class Current extends Account{
    public Current(double balance) {
        super(balance);
    }

    void withdraw(double amount, int tax) {
        balance -= amount-tax;
        System.out.println("balance " + balance);
    }

    void deposit(double amount1, int tax) {
        balance+=amount1-tax;
        System.out.println("balance "+balance);
    }
}
