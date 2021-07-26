package com.greenfoxacademy.mysql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    public Todo (String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Boolean urgent = false;
    private Boolean done = false;
}
