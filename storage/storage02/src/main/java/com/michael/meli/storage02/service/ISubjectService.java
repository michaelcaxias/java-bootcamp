package com.michael.meli.storage02.service;

import com.michael.meli.storage02.model.Subject;

import java.util.List;

public interface ISubjectService {
    Subject findById(long id);
    List<Subject> findAll();
}
