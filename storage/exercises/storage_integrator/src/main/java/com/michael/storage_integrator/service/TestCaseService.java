package com.michael.storage_integrator.service;

import com.michael.storage_integrator.model.TestCase;
import com.michael.storage_integrator.repository.ITestCaseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        List<TestCase> testCases = repo.findAll();

        return testCases;
    }

    @Override
    public TestCase getById(long id) throws Exception {
        Optional<TestCase> testCase = repo.findById(id);

        if (testCase.isEmpty()) {
            throw new Exception("TestCase Not Found");
        }

        return testCase.get();
    }

    @Override
    public TestCase updateById(long id, TestCase testCase) {
        testCase.setLast_update(LocalDateTime.now());
        testCase.setId(id);

        return repo.save(testCase);
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public List<TestCase> getAllByLastUpdate(String date) {
        return null;
    }
}
