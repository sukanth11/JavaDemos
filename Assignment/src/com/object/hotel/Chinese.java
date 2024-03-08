package com.object.hotel;

public class Chinese extends Menu{
    void showitems(String type){
        if (type.equals("starters")){
            System.out.println("1.gobi\n 2.pani puri\n 3.masala puri ");
        } else if (type.equals("lunch")) {
            System.out.println("1.south indian\n 2.north indian");

        }else {
            System.out.println("1.jamun\n 2.rasgulaa\n 3.jelabi"  );
        }
    }
    void printgames(){
        System.out.println("1.shooting\n 2.archery\n 3.swimming");
    }
}
