package com.example.demo.controller;

import com.example.demo.User;
import com.example.demo.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }


    @PostMapping(value = "/user")
    public ResponseEntity<?> addUser (@RequestBody User user) {

        if(user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        boolean isAdded = service.createUser(user);
        if(isAdded) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}

