package com.michael.storage03.service;

import com.michael.storage03.model.Tutorial;

import java.util.List;

public interface ITutorialService {
    Tutorial create(Tutorial tutorial);
    List<Tutorial> getAll();
    Tutorial getById(Long id);
    Tutorial update(Tutorial tutorial);
    void deleteAll();
    void deleteById(Long id);
    List<Tutorial> getPublished();
    List<Tutorial> getByTitle(String title);
}
