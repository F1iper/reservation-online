package com.kamann.user.controller;

import com.kamann.exception.ThereIsNoUserException;
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
    public UserDto getUser(@PathVariable Long id) throws ThereIsNoUserException {
        return userGetService.getUserById(id);
    }

    @GetMapping("/all")
    public List<UserDto> getUsers() {
        return userListService.getUsersAsList();
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        userCreateService.execute(userDto);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
//todo: return other status when operation fail    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public String deleteUser(@PathVariable Long id) {
        return userDeleteService.isDeleted(id);
    }

}
