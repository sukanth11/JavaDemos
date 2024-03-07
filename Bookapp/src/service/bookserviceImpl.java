package service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class bookserviceImpl implements Ibookservice {
    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStaetsWith(String author) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookbyauthor=new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().startsWith(author))
                bookbyauthor.add(book);
        }
        if (bookbyauthor.isEmpty())
            throw new BookNotFoundException("book by this author not found");
        return bookbyauthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookbycategory=new ArrayList<>();
        for (Book book:books){
            if (book.getCatagory().startsWith(category))
                bookbycategory.add(book);
        }
        if (bookbycategory.isEmpty())
            throw new BookNotFoundException("book not found by category");
        return bookbycategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookbyprice=new ArrayList<>();
        for (Book book:books){
            if (book.getPrice()<=price)
                bookbyprice.add(book);
        }
        if (bookbyprice.isEmpty())
            throw new BookNotFoundException("book not found price less than");
        return bookbyprice;
    }

    @Override
    public List<Book> getByAuthorCointainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookbyauthorandcategory=new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().equals(author)&& book.getCatagory().equals(category))
                bookbyauthorandcategory.add(book);
        }
        if (bookbyauthorandcategory.isEmpty())
            throw new BookNotFoundException("book not found author and category");
        return bookbyauthorandcategory;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books=BookDetails.showBooks();
        for (Book book:books){
            if (book.getBookid()==(bookId))
                return book;
        }
        return null;
    }
}
