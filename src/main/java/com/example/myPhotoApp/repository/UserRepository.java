package com.example.myPhotoApp.repository;

import com.example.myPhotoApp.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.LinkedList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new LinkedList<>();

    public User getUser(){
        return new User("Bahjat","Khan",26,"b@yahoo.com");
    }

    public User saveUser(User user){
        user.setUserId(users.size()+1);
        users.add(user);
        return user;
    }

}
