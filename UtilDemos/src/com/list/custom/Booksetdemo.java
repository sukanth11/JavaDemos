package com.list.custom;

import java.lang.reflect.Array;
import java.util.*;

public class Booksetdemo {
    public static void main(String[] args) {
        List<Book>  books= Arrays.asList(
                new Book("java", "sukanth", 1201.20),
                new Book("java", "sukanth", 1201.20),
                new Book("python", "kishor", 1500.00),
                new Book("C", "kavya", 2000.00),
                new Book("C++", "kalandhar", 1800.20),
                new Book("html", "nikhil", 121.20)
        );

        System.out.println("List book");
        for (Book book:books)
            System.out.println(book);

        System.out.println("*******************");
        System.out.println("set books");
        Set<Book> bookset=new TreeSet<>(books);
        for (Book bok:bookset)
            System.out.println(bok);



    }
}
