package com.greenfoxacademy.day2di;

import com.greenfoxacademy.day2di.helloBeanWorld.Printer;
import com.greenfoxacademy.day2di.playingWithColors.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day2DiApplication implements CommandLineRunner {

    private final Printer printer;
    private final MyColor color;

    @Autowired
    Day2DiApplication(Printer printer, @Qualifier("blueColor") MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day2DiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        printer.log(color.printColor());
    }
}
