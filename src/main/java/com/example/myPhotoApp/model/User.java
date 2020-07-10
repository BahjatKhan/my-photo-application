package com.example.myPhotoApp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String fastName;
    private String lastName;
    private int age;
    private String email;

    public User(String fastName, String lastName, int age, String email) {
        this.fastName = fastName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
}
