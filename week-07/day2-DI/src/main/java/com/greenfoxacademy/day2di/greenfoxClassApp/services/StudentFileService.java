package com.greenfoxacademy.day2di.greenfoxClassApp.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Service
public class StudentFileService implements DataGetting {

    private List<String> names;
    private final Path path = Path.of("names.txt");

    public StudentFileService() {
        try {
            names = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);
        try {
            Files.writeString(path, student +"\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer count() {
        return names.size();
    }

    @Override
    public void newFile() {
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.write(path, names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}