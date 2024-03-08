package com.inter.lam;

public class Lamdademo {
    public static void main(String[] args) {
        //implement using lamda demo
        Igreeter igreeter=(String message)->{
            System.out.println(message);
        };
        igreeter.greetmessage("welcome sukanth");

        igreeter=message -> System.out.println(message+"sukanth how are you");
        igreeter.greetmessage("hii");
    }
}
