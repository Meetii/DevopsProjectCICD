package com.example.devops.controller;


import com.example.devops.entity.Book;
import com.example.devops.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Project for Devops!");
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id) {
        return ResponseEntity.ok(bookRepository.findById(id).get());
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookRepository.save(book));
    }

}
