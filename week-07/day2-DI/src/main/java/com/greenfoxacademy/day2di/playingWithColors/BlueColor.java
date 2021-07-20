package com.greenfoxacademy.day2di.playingWithColors;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor{
    @Override
    public String printColor() {
        return "It is blue in color...";
    }
}
