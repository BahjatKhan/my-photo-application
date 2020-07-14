package com.example.myPhotoApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User {

    @Id
    private String userId;

    private String fastName;
    private String lastName;
    private String age;
    private String email;
    private Integer serialNumber;


    public User(String fastName, String lastName, String age, String email) {
        this.fastName = fastName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
}
