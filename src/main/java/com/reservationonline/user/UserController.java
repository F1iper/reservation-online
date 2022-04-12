package com.reservationonline.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
class UserController {
    
    @Autowired
    private final UserService userService;
    
    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }
    
    @PostMapping
    User registerNewUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }
    
    @DeleteMapping(path = "{id}")
    void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
    
    @PutMapping(path = "{id}")
    void updateUser(@PathVariable("id") Long id,
                    @RequestParam(required = false) String firstname,
                    @RequestParam(required = false) String email) {
        userService.updateUser(id, firstname, email);
    }
}
