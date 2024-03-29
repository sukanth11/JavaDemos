package com.bookapp.repository;

import com.bookapp.model.Book;
import com.bookapp.util.BookDataBase;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IBookRepositoryImpl implements IBookRepository {

    @Override
    public void addBook(Book book) {
        try(Connection connection= BookDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
            statement.setInt(1,book.getBookId());
            statement.setString(2,book.getTitle());
            statement.setString(3,book.getAuthor());
            statement.setDouble(4,book.getPrice());
            statement.setString(5, book.getCategory());
            statement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(int bookId, double price) {
        try(Connection connection= BookDb.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
            statement.setInt(1,bookId);
            statement.setDouble(2,price);
            statement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException {
        return null;
    }
}
