package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepo repo;

    @Autowired
    public TodoService(TodoRepo repo) {
        this.repo = repo;
    }

    public List<Todo> getAll() {
        return repo.findAll();
    }

    public List<Todo> getAllActive(Boolean isActive) {
        return repo.findAllByDone(isActive);
    }

    public void save(Todo todo) {
        repo.save(todo);
    }

    public void saveById(Long id){
        repo.save(repo.getById(id));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }


}
