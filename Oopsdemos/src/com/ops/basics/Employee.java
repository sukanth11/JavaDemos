package com.ops.basics;

public class Employee {
    String employeename;
    int employeeid;
    Double employeesalary;

    public Employee(String employeename, int employeeid, Double employeesalary) {
        this.employeename = employeename;
        this.employeeid = employeeid;
        this.employeesalary = employeesalary;
    }

    void getdetails(){
        System.out.println("name "+employeename);
        System.out.println("employeeid "+employeeid);
        System.out.println("employeesalary "+employeesalary);

    }
    String greet(String message){
        return message+" "+employeename;
    }
}
