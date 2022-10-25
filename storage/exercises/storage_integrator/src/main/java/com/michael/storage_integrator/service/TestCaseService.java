package com.michael.storage_integrator.service;

import com.michael.storage_integrator.model.TestCase;
import com.michael.storage_integrator.repository.ITestCaseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestCaseService implements ITestCaseService {

    private final ITestCaseRepo repo;m

    @Override
    public TestCase create(TestCase testCase) {
        testCase.setLast_update(LocalDateTime.now());

        return repo.save(testCase);
    }

    @Override
    public List<TestCase> getAll() {
        List<TestCase> testCases = repo.findAll();

        return testCases;
    }

    @Override
    public TestCase getById(Long id) throws Exception {
        Optional<TestCase> testCase = repo.findById(id);

        if (testCase.isEmpty()) {
            throw new RuntimeException("TestCase não encontrado");
        }

        return testCase.get();
    }

    @Override
    public TestCase updateById(Long id, TestCase testCase) {
        Optional<TestCase> testCaseFound = repo.findById(id);

        if (testCaseFound.isEmpty()) {
            throw new RuntimeException("TestCase não encontrado");
        }

        testCase.setLast_update(LocalDateTime.now());
        testCase.setId(id);

        return repo.save(testCase);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<TestCase> getAllByLastUpdate(LocalDateTime date) {
        return repo.findByLastUpdateGreaterThanDate(date);
    }
}
