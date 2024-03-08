package com.threads.basics;

class Child extends Thread {

    Child(String name,int priority){
        super(name);
        System.out.println(this);
//        this.start();
    }
    //this is the cpu
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("5" + "*" + i + "=" + (5 * i) + " " + name);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
    public class ExThread {
        public static void main(String[] args) {
//            Child child1=new Child("child1",10);
//            Child child2=new Child("child2",5);
            Child child3=new Child("child3",15);
            child3.setDaemon(true);
            System.out.println();

//            Child child = new Child();
//            child.setName("child one");
//            System.out.println(child);
//            child.start();
////        Child child1=new Child();
//        child1.setName("child two");
//        System.out.println(child1);
//        child1.start();

            for (int i1 = 1; i1 < 11; i1++) {
                String name = Thread.currentThread().getName();
                System.out.println("10" + "*" + i1 + "=" + (10 * i1)+" "+name);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            try {
//                child1.join();
//                child2.join();
//                child3.join();
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
            System.out.println("main completed");
        }
    }

