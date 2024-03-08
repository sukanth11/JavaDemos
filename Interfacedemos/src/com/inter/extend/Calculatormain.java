package com.inter.extend;

public class Calculatormain {
    public static void main(String[] args) {
        Icalculator  icalculator=new Calculator();
        icalculator.add(10,20);
        icalculator.prodect(10,20);
        icalculator.sub(50,20);
        Iscientific iscientific=new Scientific();
        iscientific.cube(5);
        iscientific.square(12);
    }
}

