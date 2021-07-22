package com.greenfoxacademy.foxclub.repo;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxRepo {

    private final List<Fox> foxList;

    public FoxRepo() {
        foxList = new ArrayList<>();
    }

    public List<Fox> getFoxList() {
        return foxList;
    }
}
