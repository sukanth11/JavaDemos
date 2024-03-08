package com.oops.assignment;

public class Book {
    String author;
    String title;
    int price;
    String  category;

    public Book(String author, String title, int price, String category) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.category = category;
    }
    void getdetails()
    {
        System.out.println("author "+author);
        System.out.println("title "+title);
        System.out.println("price "+price);
        System.out.println("catagory "+category);
    }
    void checkbooktype()
    {
        if(price>500)
        {
            System.out.println("premium book");
        }
        else
        {
            System.out.println("standard book");
        }
    }

}
