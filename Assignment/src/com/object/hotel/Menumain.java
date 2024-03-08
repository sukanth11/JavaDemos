package com.object.hotel;

public class Menumain {
    public static void main(String[] args) {
        Menu menu=new Chinese();
        menu.showitems("starters");
        Menu menu1=new Indian();
        menu1.showitems("lunch");
        Chinese chinese=(Chinese) menu;
        chinese.printgames();
    }

}
