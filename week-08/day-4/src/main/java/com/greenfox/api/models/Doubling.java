package com.greenfox.api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doubling {

    private int received;
    private int result;

    public Doubling(int input) {
        this.received = input;
        this.result = input * 2;
    }


}
