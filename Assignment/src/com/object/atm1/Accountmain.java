package com.object.atm1;
import java.util.Scanner;
public class Accountmain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Account account=new Account(20000);
        Savings savings=new Savings(20000);
        Current current=new Current(20000);
        System.out.println("Enter the option\n  1.Savings\n 2.Current");
        int  option= scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("enter the choice\n 1.withdraw\n 2.deposit ");
                int choice= scanner.nextInt();
                if (choice==1){
                    System.out.println("enter the amount to be withdraw");
                    double amount2= scanner.nextDouble();
                    savings.withdraw(amount2);
                } else if (choice==2) {
                    System.out.println("enter the amount to be deposit");
                    double amount3=scanner.nextDouble();
                    savings.deposit(amount3,200);
                }else {
                    System.out.println("please enter the valid choice");
                }
                break;
            case 2:
                System.out.println("enter the choice\n 1.withdraw\n 2.deposit ");
                int choice1= scanner.nextInt();
                if (choice1==1){
                    System.out.println("enter the amount to be withdraw");
                    double amount4= scanner.nextDouble();
                    current.withdraw(amount4,200);
                } else if (choice1==2) {
                    System.out.println("enter the amount to be deposit");
                    double amount5=scanner.nextDouble();
                    current.deposit(amount5,200);
                }else {
                    System.out.println("please enter the valid choice");
                }
                break;
            default:
                System.out.println("please enter the vaild option");
        }
    }
}
