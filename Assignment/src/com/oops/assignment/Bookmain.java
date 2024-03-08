package com.oops.assignment;

public class Bookmain {
    public static void main(String[] args) {
        Book book=new Book("sukanth","java",2000,"programming book");
        Book  book1=new Book("kishor","python",400,"programming book");
        book.getdetails();
        book1.getdetails();
        book.checkbooktype();
        book1.checkbooktype();
    }
}
