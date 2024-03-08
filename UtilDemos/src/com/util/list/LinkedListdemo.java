package com.util.list;

import java.util.LinkedList;

public class LinkedListdemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("sukanth");
        linkedList.add("java");
        linkedList.add("html");
        linkedList.add("css");
        linkedList.add("python");
        System.out.println(linkedList);
        linkedList.addFirst("sukanthj");
        linkedList.addLast("spring");
        linkedList.set(2,"java.util");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(3));

        for (String list:linkedList)
            System.out.println(list);




    }
}
