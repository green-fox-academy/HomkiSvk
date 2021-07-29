package com.greenfox.api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DoUntil {

    private Integer result;

    public void operate(String operation, Integer until){
        if (operation.equals("sum")){
           result = summing(until);
        }
        else if (operation.equals("factor")){
            result = factoring(until);
        }
    }

    private Integer summing(int num){
        if (num == 1)
            return 1;

        else
            return num + summing(num-1);
    }

    private Integer factoring(int num){
        if (num == 1)
            return 1;

        else
            return num * factoring(num-1);
    }

}
