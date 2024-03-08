package com.inter.extend;

public class Calculator implements Icalculator {
    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void prodect(int x, int y) {
        System.out.println(x*y);
    }
}
