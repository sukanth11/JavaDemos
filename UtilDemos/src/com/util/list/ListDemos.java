package com.util.list;

import java.util.*;

public class ListDemos {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        System.out.println(list.size());
        list.add("Java");
        list.add("100.5");
        list.add("Spring");
        list.add("Kishor");
        list.add("Html");
        list.add("CSS");
        list.add(1,"Python");
        System.out.println(list);
        list.set(2,"Sukanth");
        System.out.println(list.size());

        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            String string=iterator.next();
            System.out.println(string);
        }
        System.out.println();
        ListIterator<String> listIterator= list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            String string1=listIterator.previous();
            System.out.println(string1);
        }
        System.out.println("-----------");
        System.out.println("sorting the array");
        Collections.sort(list);
        for (String val:list)
            System.out.println("values are "+val.toUpperCase());

    }
}
