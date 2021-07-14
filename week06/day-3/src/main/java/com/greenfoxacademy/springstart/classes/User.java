package com.greenfoxacademy.springstart.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class User {

    private String name;
    private int age;
    private boolean isMarried;

    public User(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }
}
