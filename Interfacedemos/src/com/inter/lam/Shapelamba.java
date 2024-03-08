package com.inter.lam;

public class Shapelamba {
    public static void main(String[] args) {
        Ishape ishape=(int x,int y)-> System.out.println(x+y);
        ishape.area(10,20);

        ishape=(x,y)-> System.out.println(x*y);
        ishape.area(5,10);


    }

}
