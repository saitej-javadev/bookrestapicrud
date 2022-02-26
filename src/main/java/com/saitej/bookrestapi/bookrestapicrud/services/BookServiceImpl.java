package com.saitej.bookrestapi.bookrestapicrud.services;

import com.saitej.bookrestapi.bookrestapicrud.entities.Book;
import com.saitej.bookrestapi.bookrestapicrud.repositories.BookRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository repository;
    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    @Override
    public Book getBookById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Book getBookByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book updateBook(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
        repository.deleteById(id);

    }

}
