package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class compareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("java", "sukanth", 1201.20),
                                        new Book("python", "kishor", 1500.00),
                                        new Book("C", "kavya", 2000.00),
                                        new Book("C++", "kalandhar", 1800.20),
                                         new Book("html", "nikhil", 121.20));

        /*List<Book> books=new ArrayList<>();
        books.add(new Book("java","sukanth",1201.20));
        books.add(new Book("python","kishor",1500.00));
        books.add(new Book("C","kavya",2000.00));
        books.add(new Book("C++","kalandhar",1800.20));
        books.add(new Book("html","nikhil",121.20));*/


        System.out.println("before sorting");
        for (Book book : books)
            System.out.println(book);

        System.out.println("after sorting");
        Collections.sort(books);
        for (Book book : books)
            System.out.println(book);

    }
}
