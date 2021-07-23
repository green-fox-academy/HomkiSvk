package com.greenfoxacademy.foxclub.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Fox {

    private String name;
    private List<Trick> tricks;
    private Foods food;
    private Drinks drink;

    public Fox(String name) {
        this.name = name;
        this.drink = Drinks.YOHOO;
        this.food = Foods.KITKAT;
        this.tricks = new ArrayList<>();
    }

    public void addTrick(Trick trick) {
        if (!tricks.contains(trick))
            tricks.add(trick);
    }
}
