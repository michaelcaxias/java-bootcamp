package br.dh.meli.storage01.controller;

import br.dh.meli.storage01.model.UserBD;
import br.dh.meli.storage01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserBD> newUser(@RequestBody UserBD userBody) {
        UserBD userBD = service.create(userBody);

        return new ResponseEntity<>(userBD, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<UserBD> findByCod(@PathVariable long cod) throws Exception {
        UserBD optionalUserBD = service.findByCod(cod);

        return new ResponseEntity<>(optionalUserBD, HttpStatus.OK);
    }

}
