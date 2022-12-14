package com.michael.meli.storage02.service;

import com.michael.meli.storage02.dto.AuthorDTO;
import com.michael.meli.storage02.model.Author;

public interface IAuthorService {
    Author create(Author author);
    Author findById(long id);
    void deleteById(long id);
    AuthorDTO getById(long id);
}
