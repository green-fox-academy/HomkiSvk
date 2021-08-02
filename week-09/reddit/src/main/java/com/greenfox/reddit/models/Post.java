package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String url;
    private int voteValue = 0;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date created = new Date();

}