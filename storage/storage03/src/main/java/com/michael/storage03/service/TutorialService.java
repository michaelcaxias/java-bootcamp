package com.michael.storage03.service;

import com.michael.storage03.exceptions.InvalidParamException;
import com.michael.storage03.model.Tutorial;
import com.michael.storage03.repository.ITutorialRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorialService implements ITutorialService {

    private final ITutorialRepo repo;

    @Override
    public Tutorial create(Tutorial tutorial) {
        if (tutorial == null) {
            throw new InvalidParamException("O tutorial não pode ser nulo");
        }
        if (tutorial.getId() != null) {
            throw new InvalidParamException("O tutorial não pode ter ID");
        }

        return repo.save(tutorial);
    }

    @Override
    public List<Tutorial> getAll() {
        return null;
    }

    @Override
    public Tutorial getById(Long id) {
        return null;
    }

    @Override
    public Tutorial update(Tutorial tutorial) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Tutorial> getPublished() {
        return null;
    }

    @Override
    public List<Tutorial> getByTitle(String title) {
        return null;
    }
}
