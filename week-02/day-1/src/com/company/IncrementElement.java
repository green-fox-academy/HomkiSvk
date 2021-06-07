package com.company;

import java.util.Arrays;

public class IncrementElement {
    // - Create an array variable named `numbers`
    //   with the following content: `[1, 2, 3, 4, 5]`
    // - Increment the third element
    // - Print the third element

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        System.out.println("Array before: " + Arrays.toString(numbers));

        numbers[2]++ ;

        System.out.println("From array" + Arrays.toString(numbers) + " changed element is: \n" +numbers[2]);

    }
}
