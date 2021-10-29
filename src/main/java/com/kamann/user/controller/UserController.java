package com.kamann.user.controller;

import com.kamann.exception.ResourceNotFoundException;
import com.kamann.user.dto.UserDto;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserCreateService;
import com.kamann.user.service.UserDeleteService;
import com.kamann.user.service.UserGetService;
import com.kamann.user.service.UserListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserGetService userGetService;
    private final UserListService userListService;
    private final UserCreateService userCreateService;
    private final UserDeleteService userDeleteService;
    private final UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) throws ResourceNotFoundException {
        if (userRepository.existsById(id)) {
            return new ResponseEntity<>(userGetService.getUserById(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getUsers() {
        return new ResponseEntity<>(userListService.getUsersAsList(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        userCreateService.execute(userDto);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteUser(@PathVariable Long id) {
        if (userDeleteService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
