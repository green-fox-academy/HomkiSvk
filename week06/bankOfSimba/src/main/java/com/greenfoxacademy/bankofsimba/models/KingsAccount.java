package com.greenfoxacademy.bankofsimba.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class KingsAccount extends BankAccount{

    public KingsAccount(String name, Double balance, String animalType, Boolean badOrGood) {
        super(name, balance, animalType, badOrGood);
    }

}
