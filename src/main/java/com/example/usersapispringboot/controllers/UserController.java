package com.example.usersapispringboot.controllers;

import com.example.usersapispringboot.entities.User;
import com.example.usersapispringboot.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService service;

    @PostMapping
    public ResponseEntity<User> create(RequestEntity<User> request){
        return service.create(request);
    }

}
