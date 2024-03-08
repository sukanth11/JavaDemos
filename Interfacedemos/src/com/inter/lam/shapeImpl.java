package com.inter.lam;

public class shapeImpl {
    public static void main(String[] args) {
        Ishape ishape = new Ishape() {

            @Override
            public void area(int x, int y) {
                System.out.println(x * y);
            }
        };
        ishape.area(10, 20);

        Ishape ishape1 = new Ishape() {

            @Override
            public void area(int x, int y) {
                System.out.println(x + y);
            }
        };
        ishape.area(11, 21);
    }
}
