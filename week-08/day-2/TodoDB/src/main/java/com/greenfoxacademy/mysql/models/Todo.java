package com.greenfoxacademy.mysql.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description ;
    private Boolean urgent = false;
    private Boolean done = false;

    @Temporal(value = TemporalType.DATE)
    private Date creationDate = new Date();

    @Temporal(value = TemporalType.DATE)
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    @JsonIgnore
    private Assignee assignee;

    public void setDueDate(String date) {
        this.dueDate = java.sql.Date.valueOf(date);
    }

}