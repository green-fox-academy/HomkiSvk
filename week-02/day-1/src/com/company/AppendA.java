package com.company;

import java.util.Arrays;

public class AppendA {
    // - Create an array variable named `animals`
    //   with the following content:
    //   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
    //     "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"]`
    //
    // - Add an `"a"` at the end of all elements (use a loop!)

    public static void main(String[] args) {
        String [] animals = new String []{"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                 "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"};

        System.out.println("Before: " +Arrays.toString(animals));

        for (int i = 0; i < animals.length; i++) {
            animals[i] += 'a';
        }
        System.out.println("After: " +Arrays.toString(animals));
    }
}
