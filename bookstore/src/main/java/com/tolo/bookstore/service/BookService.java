package com.tolo.bookstore.service;

import com.tolo.bookstore.entiti.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBook();

    Book getBookById(long id);

    Book getBookByName(String name);

    Book getBookByKey(String key);

    List<Book> createBooks(List<Book> books);

    Book editBook(Book book);

    void deleteBook(long[] ids);
}

