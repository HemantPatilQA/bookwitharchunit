package com.selflearning.bookwitharchunit.services;

import com.selflearning.bookwitharchunit.dtos.BookDTO;
import com.selflearning.bookwitharchunit.entities.Book;
import com.selflearning.bookwitharchunit.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
