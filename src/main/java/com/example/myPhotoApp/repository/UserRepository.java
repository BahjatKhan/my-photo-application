package com.example.myPhotoApp.repository;

import com.example.myPhotoApp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        return new User("Bahjat","Khan",26,"b@yahoo.com");
    }
}
