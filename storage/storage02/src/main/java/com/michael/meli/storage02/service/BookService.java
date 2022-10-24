package com.michael.meli.storage02.service;

import com.michael.meli.storage02.model.Book;
import com.michael.meli.storage02.repository.IBookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {

    private final IBookRepo repo;

    @Override
    public Book findById(long id) {
        Optional<Book> optionalBook = repo.findById(id);

        return optionalBook.orElse(null);
    }
}
