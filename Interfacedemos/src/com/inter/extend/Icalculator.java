package com.inter.extend;

public interface Icalculator {
    void add( int x,int y);
    void prodect(int x,int y);
    default void sub(int x,int y){
        System.out.println(x-y);
    }
}
