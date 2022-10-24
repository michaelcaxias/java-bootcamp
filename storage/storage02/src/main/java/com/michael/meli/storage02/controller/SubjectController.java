package com.michael.meli.storage02.controller;

import com.michael.meli.storage02.model.Subject;
import com.michael.meli.storage02.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping("{id}")
    public ResponseEntity<Subject> findById(@PathVariable long id) {
        Subject subject = service.findById(id);

        if (subject != null) {
            return ResponseEntity.ok(subject);
        }

        return ResponseEntity.notFound().build();

    }

    @GetMapping
    public ResponseEntity<List<Subject>> getAll() {
        List<Subject> subjects = service.findAll();

        return ResponseEntity.ok(subjects);
    }
}
