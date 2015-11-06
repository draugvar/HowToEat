package com.example.draug.howtoeat;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject{
    private static User instance = null;

    private String name;
    private String surname;

    @PrimaryKey
    private String email;

    private String password;

    public static String NAME = "user_name";
    public static String EMAIL = "user_email";
    public static String PASSWORD = "user_password";

    public static User getIstance(){
        if( instance == null)
            instance = new User();
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
