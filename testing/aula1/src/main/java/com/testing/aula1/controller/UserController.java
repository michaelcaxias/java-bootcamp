package com.testing.aula1.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.aula1.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @PostMapping
    public ResponseEntity<UserDto> newUser(@Valid @RequestBody UserDto userDto) {

        return ResponseEntity.ok(userDto);
    }
}
