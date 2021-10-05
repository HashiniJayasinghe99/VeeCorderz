package com.example.test;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;

public class User {

    public String fullName, age, email;

    public User() {

    }

    public User(String fullName, String age, String email) {

        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }



}
