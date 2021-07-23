package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.repo.FoxRepo;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

    FoxRepo repo;

    public FoxService(FoxRepo repo) {
        this.repo = repo;
    }

    public boolean createFox(String name) {
        if (name != null || !(name.equals(""))) {
            return repo.getFoxList().add(new Fox(name));
        }
        else return false;
    }

    public Fox getFox(String name) {
        return repo.getFoxList().stream()
                .filter(fox -> fox.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public boolean isValid(String name) {
        return name != null && getFox(name) != null && !name.equals("");
    }
}
