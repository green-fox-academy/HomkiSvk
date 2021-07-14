package com.greenfoxacademy.springstart.classes;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Greeting {

    private long greedCount;
    private String content;

    public Greeting(long id, String greet) {
        this.greedCount = id;
        this.content = greet;
    }
}
