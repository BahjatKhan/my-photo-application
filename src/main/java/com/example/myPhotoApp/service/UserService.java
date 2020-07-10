package com.example.myPhotoApp.service;

import com.example.myPhotoApp.model.User;
import com.example.myPhotoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUser(){
        return userRepository.getUser();
    }
}
