package com.inter.lam;

public class Rectangle implements Ishape {
    @Override
    public void area(int x, int y) {
        System.out.println("rect "+x*y);
    }
}
