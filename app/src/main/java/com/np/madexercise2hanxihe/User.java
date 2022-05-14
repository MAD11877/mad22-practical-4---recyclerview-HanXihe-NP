package com.np.madexercise2hanxihe;

import java.io.Serializable;

public class User implements Serializable { // i know its slow
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(){ }

    public User(String name, String desc, Integer id, Boolean followed) {
        this.name = name;
        this.description = desc;
        this.id = id;
        this.followed = followed;
    }
}
