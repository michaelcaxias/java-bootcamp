package com.michael.storage_integrator.controller;

import com.michael.storage_integrator.model.TestCase;
import com.michael.storage_integrator.service.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
