package com.michael.meli.storage02.repository;

import com.michael.meli.storage02.dto.AuthorDTO;
import com.michael.meli.storage02.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAuthorRepo extends JpaRepository<Author, Long> {

    @Query("select a from Author a where a.id = ?1")
    AuthorDTO getById(long id);
}
