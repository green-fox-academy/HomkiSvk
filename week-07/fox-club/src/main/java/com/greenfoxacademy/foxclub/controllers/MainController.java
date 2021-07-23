package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final FoxService service;

    @Autowired
    MainController(FoxService service){
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam (required = false) String name) {
        if (name == null || service.getFox(name) == null || name.equals(""))
            return "login";
        else {
            model.addAttribute("fox", service.getFox(name));
            model.addAttribute("infoPage", true);
            return "index";
        }
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginFox(@RequestParam String name) {
        return (service.createFox(name)) ? ("redirect:/?name=" + name) : ("login");
    }
}