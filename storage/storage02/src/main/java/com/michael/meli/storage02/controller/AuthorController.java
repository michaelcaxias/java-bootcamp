package com.michael.meli.storage02.controller;

import com.michael.meli.storage02.model.Author;
import com.michael.meli.storage02.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
