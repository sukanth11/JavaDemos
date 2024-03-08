package com.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executedemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for (int i=1;i<=10;i++){
            executorService.execute(()->{
                System.out.println("hii welcome to voya india ");
            });

        }
        executorService.shutdown();
    }
}
