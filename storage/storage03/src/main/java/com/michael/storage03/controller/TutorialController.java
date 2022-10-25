package com.michael.storage03.controller;

import com.michael.storage03.model.Tutorial;
import com.michael.storage03.service.ITutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

    @Autowired
    private ITutorialService service;

    @PostMapping
    public ResponseEntity<Tutorial> create(@RequestBody Tutorial newTutorial) {
        Tutorial tutorial = service.create(newTutorial);

        return new ResponseEntity<>(tutorial, HttpStatus.CREATED);
    }
}
