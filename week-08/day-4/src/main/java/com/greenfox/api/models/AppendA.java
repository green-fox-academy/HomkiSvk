package com.greenfox.api.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AppendA {

    private String appended;

    public AppendA(String text){
        this.appended = text +"a";
    }

}
