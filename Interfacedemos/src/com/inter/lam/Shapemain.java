package com.inter.lam;

public class Shapemain {
    public static void main(String[] args) {
        Shapefactory  shapefactory=new Shapefactory();
        //create
        Ishape ishape=new Rectangle();

        shapefactory.printarea(ishape,10,20);

        shapefactory.printarea(new Ishape(){

            @Override
            public void area(int x, int y) {
                System.out.println("calculate area");
                System.out.println("tri"+(x*y*0.5));
            }
        },10,20);

        System.out.println("-------lamda-------");
        shapefactory.printarea((int x, int y)->{
            System.out.println("calculating square");
            System.out.println("square"+(x*x));
        },5,10);
    }
}
