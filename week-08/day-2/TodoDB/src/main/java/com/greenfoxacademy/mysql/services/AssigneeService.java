package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Assignee;
import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repos.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

    private final AssigneeRepo assigneeRepo;

    @Autowired
    public AssigneeService(AssigneeRepo assigneeRepo) {
        this.assigneeRepo = assigneeRepo;
    }

    public void save(Assignee assignee) {
        assigneeRepo.save(assignee);
    }

    public List<Assignee> getAll() {
        return assigneeRepo.findAll();
    }

    public void delete(Long id) {
        assigneeRepo.deleteById(id);
    }

    public void saveById(Long id, String name) {
        Assignee temp = assigneeRepo.getById(id);
        temp.setName(name);
        assigneeRepo.save(temp);
    }

    public List<Todo> getTodosByAssignee(Long id) {
        return assigneeRepo.getById(id).getTodoList();
    }

    public List<Todo> getTodosByAssigneesName(String name) {
        return assigneeRepo.getAssigneeByName(name).getTodoList();
    }

}
