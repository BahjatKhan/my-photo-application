package com.example.myPhotoApp.resource;

import com.example.myPhotoApp.model.User;
import com.example.myPhotoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user/info")
    public User getUser(){
        return userService.getUser();
    }


}
