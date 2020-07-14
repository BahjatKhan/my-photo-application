package com.example.myPhotoApp.repository;

import com.example.myPhotoApp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

   List<User> getByAge(String string);

}
