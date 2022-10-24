package com.michael.meli.storage02.repository;

import com.michael.meli.storage02.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepo extends JpaRepository<Author, Long> {
}
