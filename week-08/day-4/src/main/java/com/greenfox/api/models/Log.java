package com.greenfox.api.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Log {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
    private String endpoint;
    private String data;

    public Log (String endpoint, String data) {
        this.endpoint = endpoint;
        this.data = data;
    }


}
