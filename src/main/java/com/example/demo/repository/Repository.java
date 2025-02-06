package com.example.demo.repository;


import com.example.demo.User;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    private final List<User> list = new ArrayList<>();

    public boolean createUser(User user) {
       return list.add(user);
    }
}
