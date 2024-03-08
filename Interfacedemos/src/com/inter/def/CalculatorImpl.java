package com.inter.def;

public class CalculatorImpl implements Inbonuscalculator,Iallowancecalculator{
    @Override
    public void calculator(double amount) {
        System.out.println(amount+amount+1000);
    }

    @Override
    public void policytype() {
        System.out.println("policy of all the employee");
        Inbonuscalculator.super.policytype();
        Iallowancecalculator.super.policytype();
    }
}
