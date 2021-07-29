package com.greenfox.api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AwesomeGreeting {

    private String welcome_message;

    public AwesomeGreeting(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title+ "!";
    }

}
