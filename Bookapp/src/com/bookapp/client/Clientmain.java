package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import service.Ibookservice;
import service.bookserviceImpl;

import java.util.List;
import java.util.Scanner;

public class Clientmain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name");
        String name=scanner.next();
        Ibookservice ibookservice=new bookserviceImpl();
        List<Book> booksByCategory;
        try {
            booksByCategory=ibookservice.getByCategory(name);
            for (Book book:booksByCategory)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("*************************");
        String authorname=scanner.next();
        System.out.println("find books by author");
        List<Book> booksByAuthor;
        try {
            booksByAuthor=ibookservice.getByAuthorStaetsWith(authorname);
            for (Book book:booksByAuthor)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
}
