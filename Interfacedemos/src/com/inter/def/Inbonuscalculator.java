package com.inter.def;

public interface Inbonuscalculator {

    void calculator(double amount);
    default void policytype(){
        System.out.println("policy of bonus");
    }
    static void show(){
        System.out.println("show the data");
    }
}
