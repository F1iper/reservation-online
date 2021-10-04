package com.kamann.user.controller;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserCreateService;
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

    private final UserCreateService userCreateService;
    private final UserListService userListService;
//    private final UserDeleteService userDeleteService;
//    private final UserRepository userRepository;

    @GetMapping("/id")
    public UserDto getUser() {
        return new UserDto();
    }

    @GetMapping("/all")
    public List<UserDto> getUsers() {
        return userListService.mapUserToDto();
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        userCreateService.execute(userDto);
        return new ResponseEntity<>(userDto,HttpStatus.CREATED);
    }

}
