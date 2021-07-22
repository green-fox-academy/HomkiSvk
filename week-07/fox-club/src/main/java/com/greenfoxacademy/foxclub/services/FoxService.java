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

    public Fox createFoxGetList(String name) {
        Fox foxie = null;
        if (name != null) {
            foxie = repo.getFoxList().stream()
                    .filter(fox -> fox.getName().equals(name))
                    .findAny()
                    .orElse(null);
            if (foxie == null) {
                foxie = new Fox(name);
                repo.getFoxList().add(foxie);
            }
        }
        return foxie;
    }


}
