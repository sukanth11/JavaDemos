package com.inter.lam;

public class Shapefactory {
    void  printarea(Ishape ishape,int x,int y){
        System.out.println("printing area");
        ishape.area(x,y);
        System.out.println("completed");
    }
}
