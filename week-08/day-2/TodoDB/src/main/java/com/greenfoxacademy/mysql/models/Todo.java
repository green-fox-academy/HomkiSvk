package com.greenfoxacademy.mysql.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Instant;
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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String dueDate;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    @JsonIgnore
    private Assignee assignee;

}