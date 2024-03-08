package com.inter.basics;

public class Developerdetails implements Ientertainment {
    @Override
    public void showgames(String type) {
        if (type.equals("indoor"))
            System.out.println("chess and carrom");
        else
            System.out.println("kabbadi and football");
    }

    @Override
    public void showactivity() {
        System.out.println("weekly lunch with manager");
    }
}
