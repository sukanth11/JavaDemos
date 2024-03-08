package com.threads.basics;


public class Demo {
    public static void main(String[] args) {

        Runnable runnable=()->{
            System.out.println("sukanth");
        };
        Thread thread=new Thread(runnable,"sukanth");
        Thread thread1=new Thread(()->{
            System.out.println("task2");
        });
        thread.start();
        thread1.start();
    }
}
