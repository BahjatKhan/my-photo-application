package com.example.myPhotoApp.repository;

import com.example.myPhotoApp.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.LinkedList;
import java.util.List;

@Repository
public class UserRepository {
    private  List<User> users = new LinkedList<>();


    public User getUser(){
        return new User("Bahjat","Khan",26,"b@yahoo.com");
    }

    public User saveUser(User user){
        user.setUserId(users.size()+1);
        users.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUserId(int userId) {
        for( User user : users){
            if (userId==user.getUserId())
                return user;
            else
                System.out.println("User Not Found");

        }
        return null;
    }

    public User updateUser(int userId, User user) {
        for(User u: users){
            if(userId==u.getUserId()){
                u.setFastName(user.getFastName());
                u.setLastName(user.getLastName());
                u.setAge(user.getAge());
                u.setEmail(user.getEmail());
                return u;
            }
        }
        return null;
    }

    public User deleteUser(int userId) {
        User deleteUser=null;
        for(User user: users){
            if (user.getUserId()==userId){
                deleteUser=user;
                users.remove(user);
                break;
            }
        }
        return deleteUser;
    }
}
