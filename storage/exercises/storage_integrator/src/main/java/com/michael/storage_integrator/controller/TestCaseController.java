package com.michael.storage_integrator.controller;

import com.michael.storage_integrator.model.TestCase;
import com.michael.storage_integrator.service.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testcases")
public class TestCaseController {

    @Autowired
    private ITestCaseService service;

    @PostMapping("/new")
    public ResponseEntity<TestCase> create(@RequestBody TestCase newTestCase) {
        TestCase testCase = service.create(newTestCase);

        return new ResponseEntity<>(testCase, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<TestCase>> getAll() {
        List<TestCase> testCases = service.getAll();

        return new ResponseEntity<>(testCases, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestCase> updateById(@PathVariable Long id, @RequestBody TestCase newTestCase) {
        TestCase testCase = service.updateById(id, newTestCase);

        return new ResponseEntity<>(testCase, HttpStatus.ACCEPTED);
    }
}
