package com.example.usersapispringboot.services;

import com.example.usersapispringboot.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {

    //create
    User createUser(User user);

    //list users
    List<User> getUsers();

    //get user by id
    User getUser(Long id);

    //update
    User updateUser(Long id);

}
