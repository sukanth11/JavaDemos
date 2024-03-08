package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers=new ArrayList<>();
        customers.add(new Customer("sukanth",303102,"dunda"));
        customers.add(new Customer("kishor",303103,"ammasandhra"));
        customers.add(new Customer("kavya",303104,"chenagiri"));
        customers.add(new Customer("harshitha",303105,"tumkuru"));
        customers.add(new Customer("nikhil",303106,"dharwad"));
        customers.add(new Customer("kalandhar",303107,"bengaluru"));
        customers.set(3,new Customer("chandan",303108,"bengaluru"));

        List<Customer> customersbycity=new ArrayList<>();
        for (Customer customer:customers)
            if (customer.getCity().equals("bengaluru"))
                customersbycity.add(customer);

        Iterator iterator=customersbycity.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());



    }
}
