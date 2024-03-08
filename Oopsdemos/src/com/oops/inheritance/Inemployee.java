package com.oops.inheritance;

public class Inemployee {
    String employeename;
    int employeeid;

    public Inemployee(String employeename, int employeeid) {
        this.employeename = employeename;
        this.employeeid = employeeid;
    }

    public Inemployee() {
    }

    void getdetails(){
        System.out.println(employeename+" "+employeeid);
    }
}
