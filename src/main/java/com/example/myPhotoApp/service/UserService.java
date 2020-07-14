package com.example.myPhotoApp.service;

import com.example.myPhotoApp.model.User;
import com.example.myPhotoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }
    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

   public List<User> getByAge(String age) {
        return userRepository.getByAge(age);
    }



 /*

    public User saveUser(User user){
        return saveUser.saveUser(user);
    }

    public List<User> printAllUser() {
        return userRepository.getAllUsers();
    }

    public User getUserByUserId(int userId) {
        return userRepository.getUserByUserId(userId);
    }

    public User updateUser(int userId, User user) {
        return userRepository.updateUser(userId,user);
    }

    public User deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }*/

 /*   public User updateBySerialNumber(Integer serialNumber) {
        return userRepository.updateBySerialNumber(serialNumber);
    }*/
}
