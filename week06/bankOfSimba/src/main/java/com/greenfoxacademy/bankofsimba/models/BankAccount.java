package com.greenfoxacademy.bankofsimba.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {

    private String name;
    private Double balance;
    private String animalType;
    private Boolean badOrGood;

}
