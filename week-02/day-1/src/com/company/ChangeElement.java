package com.company;

import java.util.Arrays;

public class ChangeElement {
    // - Create an array variable named `numbers`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the value of the fourth element (8) to 4
    // - Print the fourth element

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 8, 5, 6};

        System.out.println("Array before: " + Arrays.toString(numbers));

        numbers[3] = 4;

        System.out.println("From array" + Arrays.toString(numbers) + " changed element is: \n" +numbers[3]);
    }

}
