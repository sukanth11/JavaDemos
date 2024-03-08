package com.oops.overloading;

public class Varargsmain {
    public static void main(String[] args) {
        Varargs varargs=new Varargs();
        varargs.calsum("sukanth");
        System.out.println("              ");
        varargs.calsum("sukanth",10,20,30);
        System.out.println("              ");
        varargs.calsum("sukanth",80,90);
    }
}
