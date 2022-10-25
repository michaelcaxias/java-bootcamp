package com.michael.storage_integrator.service;

import com.michael.storage_integrator.model.TestCase;

import java.util.List;

public interface ITestCaseService {
    TestCase create(TestCase testCase);
    List<TestCase> getAll();
    TestCase getById(long id);
    TestCase updateById(long id, TestCase testCase);
    void deleteById(long id);
    List<TestCase> getAllByLastUpdate(String date);
}
