package com.greenfoxacademy.listingtodos.controllers;

import com.greenfoxacademy.listingtodos.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/todo")
public class TodoController {

    private TodoRepo repo;

    @Autowired
    public TodoController (TodoRepo repo){
        this.repo = repo;
    }

    @GetMapping({"/" , "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }

}
