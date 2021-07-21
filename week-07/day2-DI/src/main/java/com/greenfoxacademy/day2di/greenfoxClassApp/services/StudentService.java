package com.greenfoxacademy.day2di.greenfoxClassApp.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements DataGetting {
    private final List<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public Integer count() {
        return names.size();
    }

    @Override
    public void newFile() {
        Path path = Path.of("names.txt");
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
