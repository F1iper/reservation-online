package com.reservationonline.user.controller;

import com.reservationonline.user.entity.User;
import com.reservationonline.user.repository.UserRepository;
import com.reservationonline.user.service.UserGetAsListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserGetAsListService getAsList;
//    private final UserGetById getById;
//    private final UserAddService add;
//    private final UserRemoveService remove;

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
