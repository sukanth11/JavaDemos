package com.inter.lam;

public class Menulamda {
    public static void main(String[] args) {
        Imenu imenu=()-> {
            System.out.println("noodels");
            System.out.println("fried rice");
            System.out.println("gobi");
        };
        imenu.showmenus();

        imenu=()-> {
            System.out.println("south indian meals");
            System.out.println("masala dosa");
            System.out.println("ragi mudde");
        };
        imenu.showmenus();

        imenu=()-> {
            System.out.println("tacobell");
            System.out.println("pizza");
            System.out.println("burger");
        };
        imenu.showmenus();
    }
}
