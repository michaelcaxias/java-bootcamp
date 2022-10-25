package com.michael.storage_integrator.repository;

import com.michael.storage_integrator.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITestCaseRepo extends JpaRepository<TestCase, Long> {
}
