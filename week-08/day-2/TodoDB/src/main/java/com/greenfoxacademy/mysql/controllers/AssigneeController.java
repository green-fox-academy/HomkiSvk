package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Assignee;
import com.greenfoxacademy.mysql.services.AssigneeService;
import com.greenfoxacademy.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo/assignee")
public class AssigneeController {

    private final TodoService todoService;
    private final AssigneeService assigneeService;

    @Autowired
    public AssigneeController (TodoService todoService, AssigneeService assigneeService){
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping("/")
    public String all(Model model) {
        model.addAttribute("assignees", assigneeService.getAll());
        return "assigneeList";
    }

    @GetMapping("/add")
    public String add() {
        return "assigneeAdd";
    }

    @PostMapping("/add")
    public String addNew(@ModelAttribute Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/todo/assignee/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        assigneeService.delete(id);
        return "redirect:/todo/assignee/";
    }

    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable Long id) {
        return "assigneeAdd";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id) {
        assigneeService.saveById(id);
        return "redirect:/todo/assignee/";
    }




}
