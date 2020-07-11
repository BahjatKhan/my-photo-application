package com.example.myPhotoApp.resource;

import com.example.myPhotoApp.model.User;
import com.example.myPhotoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService service;

    @GetMapping("/user/info")
    public User getUser(){
        return userService.getUser();
    }

    @PostMapping("/saveUser")
    public User getUser(@RequestBody User user){

        return service.saveUser(user);
    }

}
