package com.michael.storage_integrator.service;

import com.michael.storage_integrator.model.TestCase;
import com.michael.storage_integrator.repository.ITestCaseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestCaseService implements ITestCaseService {

    private final ITestCaseRepo repo;

    @Override
    public TestCase create(TestCase testCase) {
        TestCase createdTestCase = repo.save(testCase);
        createdTestCase.setLast_update(LocalDateTime.now());

        return createdTestCase;
    }

    @Override
    public List<TestCase> getAll() {
        return null;
    }

    @Override
    public TestCase getById(long id) {
        return null;
    }

    @Override
    public TestCase updateById(long id, TestCase testCase) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public List<TestCase> getAllByLastUpdate(String date) {
        return null;
    }
}
