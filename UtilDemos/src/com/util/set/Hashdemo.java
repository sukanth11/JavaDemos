package com.util.set;

import java.util.*;

public class Hashdemo {
    public static void main(String[] args) {
//       Set<String> hashset=new HashSet<>();
//        Set<String> hashset=new LinkedHashSet<>();
       Set<String> hashset=new TreeSet<>();
        hashset.add("apple");
        hashset.add("pineappple");
        hashset.add("banana");
        hashset.add("watermelon");
        hashset.add("kiwi");
        hashset.add("100");
//        hashset.add(null);
        System.out.println(hashset);

        List<String> fruits=Arrays.asList("apple","mango","apple");
        Set<String> newfruits=new HashSet<>(fruits);
        System.out.println(newfruits);

        for (String hash:hashset)
            System.out.println(hash);
    }
}
