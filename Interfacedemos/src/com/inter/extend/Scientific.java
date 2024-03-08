package com.inter.extend;

public class Scientific extends Calculator implements Iscientific{
    @Override
    public void square(int x) {
        System.out.println(Math.pow(x,2));
    }

    @Override
    public void cube(int x) {
        System.out.println(Math.pow(x,3));
    }
}
