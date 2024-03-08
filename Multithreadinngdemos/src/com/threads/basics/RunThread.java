package com.threads.basics;

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings=new Greetings();
        Runner runner=new Runner("sukanth",greetings);
        Runner runner1=new Runner("kishor",greetings);
        Runner runner2=new Runner("prajwal",greetings);
        Runner runner3=new Runner("kavya",greetings);
//        Runner runner=new Runner();
//        Thread thread=new Thread(runner,"Thread-one");
//        Thread thread1=new Thread(runner,"Thread-two");
//        thread.start();
//        thread1.start();
    }
}
