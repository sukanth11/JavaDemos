package com.exception.custom;

public class CustomAtm {
    public static void main(String[] args) {
        System.out.println("welcome to sbi");
        CustomBank custombank=new CustomBank(20000);
        try {
            custombank.withdraw(1100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
