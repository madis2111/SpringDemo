package com.example.demo.service;

import com.example.demo.User;
import com.example.demo.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public boolean createUser(User user) {
       return repository.createUser(user);
    }
}
