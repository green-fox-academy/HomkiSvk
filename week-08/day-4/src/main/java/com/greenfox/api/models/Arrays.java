package com.greenfox.api.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Arrays {

    private int[] result ;

    public void calculate(String operation, Integer[] numbers) {
        switch (operation) {
            case "sum" -> summing(numbers);
            case "multiply" -> multiply(numbers);
            case "double" -> doubling(numbers);
        }
    }

    private void summing(Integer[] numbers) {
        result = new int[1];
        for (Integer number : numbers) {
            result[0] += number;
        }
    }

    private void multiply(Integer[] numbers) {
        result = new int[1];
        result[0] = numbers [0];
        for (int i = 1; i < numbers.length; i++) {
            result[0] *= numbers[i];
        }
    }

    private void doubling(Integer[] numbers) {
        result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i]*2;
        }
    }


}
