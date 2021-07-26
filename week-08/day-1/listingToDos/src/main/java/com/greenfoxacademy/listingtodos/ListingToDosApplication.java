package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class ListingToDosApplication implements CommandLineRunner {

    private TodoRepo repository;

    @Autowired
    ListingToDosApplication (TodoRepo repository) {
        this.repository = repository;
    }


    public static void main(String[] args) {
        SpringApplication.run(ListingToDosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("I have to learn Object Relational Mapping"));
        repository.save(new Todo("Walk the dog"));
        repository.save(new Todo("Wash the dish"));
        repository.save(new Todo("Clean the apartment"));
    }
}
