package com.util.maps;

import java.util.*;

public class Mapstatedemo {
    public static void main(String[] args) {
        Map<String, List<String>> statemaps=new HashMap<>();
        statemaps.put("karnataka", Arrays.asList("bengaluru","tumkuru","mysore","hubli","dharward"));
        statemaps.put("tamilnadu", Arrays.asList("chennai","coimbatore","coonoor","madurai","ooty"));
        statemaps.put("kerala", Arrays.asList("kochi","kannur","kollam","thrissur","kottayam"));
        statemaps.put("andhra pradesh", Arrays.asList("vijayawada","vizag","hyderabad","godavari","tirupathi"));

        Set<String> states=statemaps.keySet();

        for (String state:statemaps.keySet())
            System.out.println("state "+state);
            List<String> citys=statemaps.get(statemaps);
            for (String city:citys)
                System.out.println(city);





    }
}
