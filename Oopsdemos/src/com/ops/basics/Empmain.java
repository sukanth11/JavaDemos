package com.ops.basics;

public class Empmain {
    public static void main(String[] args) {
        Employee employee=new Employee("sukanth",303102,20000.00);
        employee.getdetails();
        System.out.println(employee.greet("Welcome"));
    }
}
