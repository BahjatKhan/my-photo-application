package com.example.myPhotoApp.resource;

import com.example.myPhotoApp.model.User;
import com.example.myPhotoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;


    @PostMapping
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }
    @GetMapping
    public List<User> getUser(){
        return userService.getUser();
    }
   @GetMapping("/find")
    public List<User> getByAge(@RequestParam(name="age") String age){
        return userService.getByAge(age);
    }
    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam(name="userId") String userId){
        userService.deleteUser(userId);
    }

/*    @GetMapping("/user/info")
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
    }*/

 /*   @PutMapping("/update/{serialNumber}")
    public User updateBySerialNumber(@PathVariable("serialNumber") Integer serialNumber){
        return userService.updateBySerialNumber(serialNumber);
    }*/

}
