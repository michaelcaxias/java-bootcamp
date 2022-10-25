package com.michael.storage_integrator.service;

import com.michael.storage_integrator.model.TestCase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ITestCaseService {
    TestCase create(TestCase testCase);
    List<TestCase> getAll();
    TestCase getById(Long id) throws Exception;
    TestCase updateById(Long id, TestCase testCase);
    void deleteById(Long id);
    List<TestCase> getAllByLastUpdate(LocalDateTime date);
}
