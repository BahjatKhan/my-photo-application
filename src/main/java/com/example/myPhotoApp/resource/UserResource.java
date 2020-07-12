package com.example.myPhotoApp.resource;

import com.example.myPhotoApp.model.User;
import com.example.myPhotoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

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
    @GetMapping("/allUsers")
    public List<User> printAllUser(){
        return userService.printAllUser();
    }
    @GetMapping("/specificUser/{userId}")
    public User getUserById(@PathVariable("userId") int userId){

        return userService.getUserByUserId(userId);

    }
    @PutMapping("/update/{userId}")
    public User updateUser(@PathVariable("userId") int userId,@RequestBody User user){
        return userService.updateUser(userId,user);
    }

    @DeleteMapping("/deleteUser")
    public User deleteUser(@RequestParam(name="userId") int userId){
            return userService.deleteUser(userId);
    }

}
