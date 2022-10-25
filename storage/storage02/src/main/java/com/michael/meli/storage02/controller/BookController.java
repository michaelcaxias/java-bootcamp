package com.michael.meli.storage02.controller;

import com.michael.meli.storage02.model.Book;
import com.michael.meli.storage02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("{id}")
    public ResponseEntity<Book> findById(@PathVariable long id) {
        Book book = service.findById(id);

        if (book != null) {
            return ResponseEntity.ok(book);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
