package com.michael.storage_integrator.repository;

import com.michael.storage_integrator.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ITestCaseRepo extends JpaRepository<TestCase, Long> {
    @Query("FROM TestCase testCase WHERE testCase.last_update > :date")
    List<TestCase> findByLastUpdateGreaterThanDate(@Param("date") LocalDateTime date);
}
