package com.inter.def;

public class Defmain {
    public static void main(String[] args) {
        Inbonuscalculator inbonuscalculator=new CalculatorImpl();
        inbonuscalculator.calculator(2000);
        inbonuscalculator.policytype();
        Inbonuscalculator.show();

        Iallowancecalculator iallowancecalculator=(Iallowancecalculator) inbonuscalculator;
        iallowancecalculator.calculator(4000);
        iallowancecalculator.policytype();
    }
}
