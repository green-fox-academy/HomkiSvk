package com.company;

public class Reverse {
    /*char [] arr = a.toCharArray();
        for (int i = 0; i < a.length()/2; i++) {
            char temp;
            temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1-i] = temp;
        }*/

    private static String reverse (String a){
        StringBuilder result = new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            result.append(a.charAt(i));
        }
        return result.toString();
    }

    private static String reverse2 (String a){
        StringBuilder result = new StringBuilder(a);
        return result.reverse().toString();
    }

    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String which is passed as parameter
        // Pass the toBeReversed variable to this method to check if it works well
        // Solve this task using charAt() function first
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
        System.out.println(reverse2(toBeReversed));
    }
}
