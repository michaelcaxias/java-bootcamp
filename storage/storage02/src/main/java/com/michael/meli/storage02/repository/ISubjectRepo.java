package com.michael.meli.storage02.repository;

import com.michael.meli.storage02.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepo extends JpaRepository<Subject, Long> {
}
