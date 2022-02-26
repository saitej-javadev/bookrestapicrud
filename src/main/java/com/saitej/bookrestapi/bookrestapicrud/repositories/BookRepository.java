package com.saitej.bookrestapi.bookrestapicrud.repositories;

import com.saitej.bookrestapi.bookrestapicrud.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByName(String name);
}
