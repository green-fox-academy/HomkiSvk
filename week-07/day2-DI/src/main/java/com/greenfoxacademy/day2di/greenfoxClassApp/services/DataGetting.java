package com.greenfoxacademy.day2di.greenfoxClassApp.services;

import java.util.List;

public interface DataGetting {

    List<String> findAll();
    void save(String student);
    Integer count();
    void newFile();
}
