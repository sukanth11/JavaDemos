package com.exception.custom;

import javax.naming.LimitExceededException;

public class CustomBank {
    double balance;

    public CustomBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws Exception {
        System.out.println("enter the amount ");
        try {
            if (balance - amount <= 0)
                throw new NegativeBalanceException("balance is negetive");

            if (amount > 1000)
                throw new LimitExceededException("enter the  amount with in the limit");
        } catch (NegativeBalanceException e){
            System.out.println("exception--"+e.getMessage());
            throw  e;
        }catch (LimitExceededException e){
            System.out.println("exception--"+e.getMessage());
            throw  e;

    }finally {
            System.out.println("close database");
        }
        System.out.println("work done");
    }
}
