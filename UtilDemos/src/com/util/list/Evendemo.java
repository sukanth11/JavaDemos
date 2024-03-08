package com.util.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Evendemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evennumber=new ArrayList<>();
//        List<Integer> oddnumber=new ArrayList<>();

        for(Integer number:numbers)
            if (number%2==0)
                evennumber.add(number);
//            else
//                oddnumber.add(number);

        Iterator iterator=evennumber.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}
