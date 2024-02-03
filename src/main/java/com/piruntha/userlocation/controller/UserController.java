package com.piruntha.userlocation.controller;

import com.piruntha.userlocation.entity.User;
import com.piruntha.userlocation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
