package com.michael.meli.storage02.controller;

import com.michael.meli.storage02.model.Author;
import com.michael.meli.storage02.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping
    ResponseEntity<Author> create(@RequestBody Author author) {
        Author newAuthor = service.create(author);

        return new ResponseEntity<>(newAuthor, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<Author> findById(@PathVariable long id) {
        Author author = service.findById(id);

        if (author != null) {
            return ResponseEntity.ok(author);
        }

        return ResponseEntity.notFound().build();
    }
}
