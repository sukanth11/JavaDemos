package com.inter.basics;

public class Intermain {
    public static void main(String[] args) {
        Ientertainment ientertainment=new Managerdetails();
        ientertainment.showgames("indoor");
        ientertainment.showactivity();

        ientertainment=new Developerdetails();
        ientertainment.showgames("outdoor");
        ientertainment.showactivity();
    }
}
