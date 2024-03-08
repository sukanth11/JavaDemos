package com.util.maps;

import java.util.*;

public class Mapsdemo {
    public static void main(String[] args) {
        Map<Integer,String> hashmap=new HashMap<>();
//        Map<Integer,String> hashmap=new LinkedHashMap<>();
//        Map<Integer,String> hashmap=new TreeMap<>();

        hashmap.put(1,"sukanth");
        hashmap.put(10,"java");
        hashmap.put(11,"python");
        hashmap.put(15,"html");
        hashmap.put(20,"css");
        hashmap.put(100,"kavya");
        hashmap.put(null,"kishor");
        System.out.println(hashmap);
        System.out.println(hashmap.get(10));
        System.out.println(hashmap.get(100));
        System.out.println(hashmap.get(15));
        System.out.println(hashmap.getOrDefault(200,"default"));
        System.out.println(hashmap.containsKey(15));
        hashmap.values();

        System.out.println("******************");
        Set<Integer> keys=hashmap.keySet();
        for (Integer key:keys)
            System.out.println(key+" "+hashmap.get(key));

        System.out.println("/////////////////////");
        System.out.println("using entry set");
        Set<Map.Entry<Integer,String>> entries= hashmap.entrySet();
        for (Map.Entry<Integer,String> entry:entries)
            System.out.println(entry.getKey()+"\t"+entry.getValue());



    }
}
