package com.execptions.basics;

public class Atm {
    public static void main(String[] args) {
        System.out.println("welcome to sbi");
        Bank bank=new Bank();
        try{
            bank.withdraw(10000);
            System.out.println("amount withdraw");

        }catch (Exception e){
            System.out.println("exception handled");
            System.out.println(e.getMessage());
        }
        System.out.println("thank you");
    }
}
