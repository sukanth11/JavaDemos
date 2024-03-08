package com.oops.inheritance;

public class Inheritemain {
    public static void main(String[] args) {
        Inemployee inemployee=new Inemployee("sukanth",303102);
        inemployee.getdetails();

        Inmanager inmanager=new Inmanager("kishor",303101,20000);
        inmanager.getdetails();
        inmanager.printbonus(10000);
    }
}
