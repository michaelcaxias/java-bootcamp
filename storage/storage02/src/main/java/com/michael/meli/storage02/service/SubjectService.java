package com.michael.meli.storage02.service;

import com.michael.meli.storage02.model.Subject;
import com.michael.meli.storage02.repository.ISubjectRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubjectService implements ISubjectService {

    private final ISubjectRepo repo;

    @Override
    public Subject findById(long id) {
        Optional<Subject> subject = repo.findById(id);

        return subject.orElse(null);
    }

    @Override
    public List<Subject> findAll() {

        return repo.findAll();
    }
}
