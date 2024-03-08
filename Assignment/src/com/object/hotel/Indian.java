package com.object.hotel;

public class Indian extends Menu{
    void showitems(String type){
        if (type.equals("breakfast")){
            System.out.println("1.idli\n 2.masaladosa\n 3.chitaranna ");
        } else if (type.equals("lunch")) {
            System.out.println("1.south indian\n 2.north indian");

        }else {
            System.out.println("1.jamun\n 2.rasgulaa\n 3.jelabi"  );
        }
    }
}
