package com.example.goldsgym.controllers;

import com.example.goldsgym.models.User;
import com.example.goldsgym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}/address")
    public User updateUserAddress(@PathVariable int id, @RequestBody String address) {
        return userService.updateUserAddress(id, address);
    }

}
