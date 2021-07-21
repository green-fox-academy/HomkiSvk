package com.greenfoxacademy.day2di.greenfoxClassApp.services;

import java.nio.file.Files;
import java.nio.file.Path;

public class DataFactory {

    public static DataGetting createData () {

        DataGetting data;

        if (Files.exists(Path.of("names.txt")))
            data = new StudentFileService();

        else
            data = new StudentService();

        return data;
    }

}
