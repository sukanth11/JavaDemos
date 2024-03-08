package com.inter.lam;

public class Calculamda {
    public static void main(String[] args) {
        Imycalculator imycalculator=(int x,int y)->{
            int sum=x+y;
            System.out.print("add");
            return sum;
        };
        imycalculator.calculate(10,20);
        imycalculator=(int x,int y)->{
            int sub=x-y;
            System.out.print("sub");
            return sub;
        };
        imycalculator.calculate(20,10);
        imycalculator=(x,y)->x*y;
        imycalculator.calculate(5,10);
        imycalculator=(x, y) -> x/y;
        imycalculator.calculate(20,10);

    }
}
