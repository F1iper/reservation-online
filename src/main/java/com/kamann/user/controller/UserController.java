package com.kamann.user.controller;

import com.kamann.user.dto.UserDto;
import com.kamann.user.mapper.UserMapper;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserCreateService userCreateService;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @GetMapping
    public List<UserDto> getUsers() {
        return new ArrayList<>();
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        userCreateService.save(userDto);
        return new ResponseEntity<>(userDto,HttpStatus.CREATED);
    }

}
