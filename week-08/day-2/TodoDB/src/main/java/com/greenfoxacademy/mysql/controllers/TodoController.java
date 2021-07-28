package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.services.AssigneeService;
import com.greenfoxacademy.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@Controller
@RequestMapping ("/todo")
public class TodoController {

    private final TodoService todoService;
    private final AssigneeService assigneeService;

    @Autowired
    public TodoController (TodoService todoService, AssigneeService assigneeService){
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping({"/" , "/list"})
    public String list(@RequestParam (required = false) String isActive, Model model) {
        if (isActive !=null){
            model.addAttribute("todos", todoService.getAllActive(!(Boolean.parseBoolean(isActive))));
        } else {
            model.addAttribute("todos", todoService.getAll());
        }
        return "todolist";
    }

    @PostMapping("/")
    public String search(@RequestParam String text, Model model){
        model.addAttribute("todos", todoService.getAllByTextInTitleOrDescription(text) );
        return "todolist";
    }

    @GetMapping("/add")
    public String postToDB() {
        return "todoAdd";
    }

    @PostMapping("/add" )
    public String updateDB(@ModelAttribute Todo todo) {
        todoService.save(todo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoService.delete(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.getById(id));
        model.addAttribute("assignees", assigneeService.getAll());
        return "todoEdit";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id, @ModelAttribute Todo todo, @RequestParam Long assigneeId) {
        todoService.saveById(id, todo);
        todoService.saveAssignee(id, assigneeId);
        return "redirect:/todo/";
    }

    @PostMapping("/date")
    public String searchByDate(@RequestParam String date, Model model){
        model.addAttribute("todos", todoService.getAllByDate(Date.valueOf(date), date));
        return "todolist";
    }

}