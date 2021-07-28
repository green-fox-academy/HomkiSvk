package com.greenfoxacademy.mysql.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    public Todo (String title) {
        this.title = title;
        this.description = "description";
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.description = "description";
        this.urgent = urgent;
        this.done = done;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Boolean urgent = false;
    private Boolean done = false;

    @Temporal(value = TemporalType.DATE)
    private Date creationDate = new Date();

    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    @JsonIgnore
    private Assignee assignee;

}
