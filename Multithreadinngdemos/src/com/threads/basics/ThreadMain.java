package com.threads.basics;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println(thread);
        thread.setName("sukanth");
        thread.setPriority(Thread.MIN_PRIORITY+6);
        System.out.println(thread);
        thread.setName("kishor");
        int[] number=null;
        System.out.println(number[0]);
    }
}
