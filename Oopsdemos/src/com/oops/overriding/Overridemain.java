package com.oops.overriding;

public class Overridemain {
    public static void main(String[] args) {
        String choice="outdoor";
        Sports sports = null;
        if(choice.equals("indoor")){
            sports =new Indoor();
        } else if (choice.equals("outdoor")) {
            sports=new Outdoor();

        }else {
            sports=new Sports();
        }
        String[] games=sports.showtypes();
        if (games!=null)
            for (String game:games)
                System.out.println(game);


    }
}
