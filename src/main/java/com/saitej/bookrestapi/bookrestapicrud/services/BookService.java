package com.saitej.bookrestapi.bookrestapicrud.services;

import com.saitej.bookrestapi.bookrestapicrud.entities.Book;

import java.util.List;

public interface BookService {

    public Book saveBook(Book book);
    public List<Book> saveBooks(List<Book> books);
    public Book getBookById(Long id);
    public Book getBookByName(String name);
    public List<Book> getAllBooks();
    public Book updateBook(Book book);
    public void deleteBookById(Long id);
}
