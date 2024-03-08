package com.list.custom;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private double price;

    public Book() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        Double price=this.getPrice();
//        return this.getAuthor().compareTo(o.getAuthor());
        return price.compareTo(o.getPrice());
//        return this.getTitle().compareTo(o.getTitle());

//        return ((Double)this.getTitle()).compareTo(o.getTitle());

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
