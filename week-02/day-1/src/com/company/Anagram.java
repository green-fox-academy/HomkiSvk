package com.company;

public class Anagram {

    public static boolean isAnagram (String a, String b){
        boolean status ;
        if (a.length() == b.length()){
            char[] aChars = a.toCharArray();
            for (int i = 0; i < aChars.length/2; i++) {
                char temp;
                temp = aChars[i];
                aChars[i] = aChars[aChars.length-1 -i];
                aChars[aChars.length-1 -i] = temp;
            } String c = new String(aChars);
            status = c.equalsIgnoreCase(b);
        } else status = false;
        return status;
    }

    public static void main(String[] args) {
        System.out.println("dog and god: " +isAnagram("dog", "god"));

        System.out.println("green and fox: " +isAnagram("green", "fox"));
    }
}
