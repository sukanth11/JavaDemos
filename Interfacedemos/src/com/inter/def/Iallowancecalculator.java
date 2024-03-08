package com.inter.def;

public interface Iallowancecalculator {
    void calculator(double amount);

    default void policytype(){
        System.out.println("policy of bonus");
    }
}
