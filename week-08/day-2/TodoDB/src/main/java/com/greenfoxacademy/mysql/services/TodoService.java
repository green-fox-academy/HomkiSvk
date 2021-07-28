package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repos.AssigneeRepo;
import com.greenfoxacademy.mysql.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepo repo;
    private final AssigneeRepo assigneeRepo;

    @Autowired
    public TodoService(TodoRepo repo, AssigneeRepo assigneeRepo) {
        this.repo = repo;
        this.assigneeRepo = assigneeRepo;
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

    public void saveById(Long id, Todo todo){
        todo.setId(id);
        repo.save(todo);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Todo> getAllByTextInTitleOrDescription(String text){
        return repo.findAllByDescriptionContainsOrTitleContains(text, text);
    }

    public void saveAssignee(Long todoId, Long assigneeId) {
        Todo todo = repo.getById(todoId);
        todo.setAssignee(assigneeRepo.getById(assigneeId));
        repo.save(todo);
    }

    public Todo getById (Long id) {
        return repo.getById(id);
    }

    public List<Todo> getAllByDate(Date crDate, Date date){
        return repo.findAllByCreationDateOrDueDateBefore(crDate, date);
    }

}