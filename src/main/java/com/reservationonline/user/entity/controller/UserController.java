package com.reservationonline.user.entity.controller;

import com.reservationonline.user.entity.User;
import com.reservationonline.user.entity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(repository.save(user), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        repository.deleteAll();
    }
}
