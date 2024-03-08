package com.object.student;

public class Student {
    String studentname;
    String department;
    int sum=0;
    public Student(String studentname, String department) {
        this.studentname = studentname;
        this.department = department;
    }
    void printdetails(){
        System.out.println("studentname: "+studentname);
        System.out.println("department: "+department);
    }
    String getgrades(int... marks){
        return null;
    }
}
