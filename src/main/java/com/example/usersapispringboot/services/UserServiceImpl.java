package com.example.usersapispringboot.services;

import com.example.usersapispringboot.entities.User;
import com.example.usersapispringboot.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserRepository repository;

    @Override
    public ResponseEntity<User> create(RequestEntity<User> request) {
        User user = request.getBody();
        assert user != null;
        repository.save(user);
        return ResponseEntity.ok().body(user);
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public User updateUser(Long id) {
        return null;
    }
}
