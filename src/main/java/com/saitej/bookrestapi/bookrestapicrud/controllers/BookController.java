package com.saitej.bookrestapi.bookrestapicrud.controllers;

import com.saitej.bookrestapi.bookrestapicrud.entities.Book;
import com.saitej.bookrestapi.bookrestapicrud.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        Book savedBook = service.saveBook(book);
        return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
    }

    @PostMapping("/saveall")
    public ResponseEntity<List<Book>> saveBooks(@RequestBody List<Book> books) {
        List<Book> savedBooks = service.saveBooks(books);
        return new ResponseEntity<List<Book>>(savedBooks, HttpStatus.CREATED);
    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Book bookById = service.getBookById(id);
        return new ResponseEntity<Book>(bookById,HttpStatus.OK);
    }
    @GetMapping("/getbyname/{name}")
    public ResponseEntity<Book> getBookByName(@PathVariable String name){
        Book bookByName = service.getBookByName(name);
        return new ResponseEntity<Book>(bookByName,HttpStatus.OK);
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> bookList = service.getAllBooks();
        return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updatedBook = service.updateBook(book);
        return new ResponseEntity<Book>(updatedBook,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> deleteById(@PathVariable Long id){
        service.deleteBookById(id);
        return new ResponseEntity<Book>(HttpStatus.ACCEPTED);

    }




























}
