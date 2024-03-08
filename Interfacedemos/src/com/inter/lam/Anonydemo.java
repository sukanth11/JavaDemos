package com.inter.lam;

public class Anonydemo {
    public static void main(String[] args) {
        Igreeter igreeter=new Greeterimpl();
        igreeter.greetmessage("good  morning");
        igreeter.greetmessage("welcome");

        Igreeter igreeter1=new Igreeter(){

            @Override
            public void greetmessage(String message) {
                System.out.println(message);
            }
        };
        igreeter1.greetmessage("welcome to anonimus");
    }
}
