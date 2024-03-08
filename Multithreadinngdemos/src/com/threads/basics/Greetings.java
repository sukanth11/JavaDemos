package com.threads.basics;

public class Greetings {
    String sayHello(String name) {
        String result = "welcome" + name;
        try {
            System.out.println("hi "+name);
            Thread.sleep(2000);
            result="have a nice day"+name;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }

}
