package com.selflearning.bookwitharchunit.controllers;

import com.selflearning.bookwitharchunit.dtos.BookDTO;
import com.selflearning.bookwitharchunit.entities.Book;
import com.selflearning.bookwitharchunit.services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired private ModelMapper modelMapper;

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO bookDTO){
        //Convert DTO to Entity
        Book bookRequest = modelMapper.map(bookDTO, Book.class);

        Book book =  bookService.addBook(bookRequest);

        //Convert entity to DTO
        BookDTO bookResponse = modelMapper.map(book, BookDTO.class);

        return new ResponseEntity<BookDTO>(bookResponse, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookDTO>> getAllBooks(){
//        return postService.getAllPosts().stream().map(post -> modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        List<BookDTO> bookDTOList =  bookService.getAllBooks().stream().map(book -> modelMapper.map(book, BookDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<List<BookDTO>>(bookDTOList, HttpStatus.OK);
    }
}
