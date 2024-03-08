package com.inter.lam;

public class Waitermain {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        waiter.availableitems(new Imenu(){

            @Override
            public void showmenus() {
                System.out.println("idly\n vada\n dosa");
            }
        });
    }
}
