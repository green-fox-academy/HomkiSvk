package com.company;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(phoneBook.get("John K. Miller"));
        for (String i: phoneBook.keySet()) {
            if (phoneBook.get(i).equals("307-687-2982")){
                System.out.println(phoneBook.get(i) +" is "+ i);
                break;
            }
        }

        if (phoneBook.containsKey("Chris E.Myers")){
            System.out.println(phoneBook.get("Chris E.Myers"));
        }
    }
}
