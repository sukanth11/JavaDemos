package com.oops.assignment;
import  java.util.Scanner;
public class Employeemain {
    public static void main(String[] args) {
        Employee emp1=new Employee("sukanth","director");
        double bonus1=emp1.calcbonus(2000);
        System.out.println(bonus1);

        Employee emp=new Employee("raj","manager");
        double  bonus=emp.calcbonus(2000,"bike");
        System.out.println(bonus);

        Employee emp2=new Employee("kishor","programmer");
        double bouns2=emp2.calcbonus(2000,"car",5000);
        System.out.println(bouns2);


       /* Scanner sc=new Scanner(System.in);
        for (int i=0,i<4,i++){
            String name = sc.next();
            String designation = sc.next();
            Employee employee = new Employee(name, designation);
            if (designation.equals("programmer")){
                employee.calcbonus(2000);
            }
            else if (designation.equals("manager")){
                employee.calcbonus(2000,"bike");
            }
            else {
                employee.calcbonus(2000,"car",5000);
            }*/


        }
    }

