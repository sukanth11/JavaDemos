package com.oops.assignment;

public class Employee {
    String employeename;
    String designation;

    public Employee(String employeename, String designation) {
        this.employeename = employeename;
        this.designation = designation;
    }
    double calcbonus(double basicallowance){
        return basicallowance;
    }
    double calcbonus(double basicallowance,String gift){
        System.out.print("gift "+ gift);
        return basicallowance;

    }
    double calcbonus(double basicallowance,String gift,double houseallowance){
        System.out.print("gift "+ gift);
        return basicallowance+houseallowance;

    }
}
