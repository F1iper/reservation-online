package com.kamann.user.controller;

import com.kamann.exception.ThereIsNoUserException;
import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.mapper.UserMapper;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserCreateService;
import com.kamann.user.service.UserDeleteService;
import com.kamann.user.service.UserGetService;
import com.kamann.user.service.UserListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserGetService userGetService;
    private final UserListService userListService;
    private final UserCreateService userCreateService;
    private final UserDeleteService userDeleteService;
    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) throws ThereIsNoUserException {
        if(userRepository.existsById(id)) {
            return new ResponseEntity<>(userGetService.getUserById(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


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
