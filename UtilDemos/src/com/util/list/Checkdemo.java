package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Checkdemo {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("watermelon");
        fruits.add("grapes");
        fruits.add("banana");
        fruits.add("pineapple");

        List<String>  newfruit=new ArrayList<>();
        for (String fruit:fruits)
            if (fruit.contains("apple")){
                newfruit.add(fruit);
            }

        Iterator iterator=newfruit.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
