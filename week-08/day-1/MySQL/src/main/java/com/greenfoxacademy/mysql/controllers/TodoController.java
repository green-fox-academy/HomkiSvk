package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/todo")
public class TodoController {

    private final TodoService service;

    @Autowired
    public TodoController (TodoService service){
        this.service = service;
    }

    @GetMapping({"/" , "/list"})
    public String list(@RequestParam (required = false) String isActive, Model model) {
        if (isActive !=null){
            model.addAttribute("todos", service.getAllActive(!(Boolean.parseBoolean(isActive))));
        } else {
            model.addAttribute("todos", service.getAll());
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String postToDB() {
        return "add";
    }

    @PostMapping("/add" )
    public String updateDB(@ModelAttribute Todo todo) {
        service.save(todo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable Long id) {
        service.delete(id);
        return "add";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id) {
        service.saveById(id);
        return "redirect:/todo/";
    }

}
