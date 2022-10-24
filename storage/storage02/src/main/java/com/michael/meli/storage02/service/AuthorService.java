package com.michael.meli.storage02.service;

import com.michael.meli.storage02.model.Author;
import com.michael.meli.storage02.repository.IAuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService {

    private final IAuthorRepo repo;

    @Override
    public Author create(Author author) {
        return repo.save(author);
    }

    @Override
    public Author findById(long id) {
        Optional<Author> optionalAuthor = repo.findById(id);

        return optionalAuthor.orElse(null);

    }

}
