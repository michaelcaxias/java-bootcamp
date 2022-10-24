package com.michael.meli.storage02.repository;

import com.michael.meli.storage02.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, Long> {
}
