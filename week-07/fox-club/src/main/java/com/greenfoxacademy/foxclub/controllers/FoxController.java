package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Drinks;
import com.greenfoxacademy.foxclub.models.Foods;
import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private final FoxService service;

    @Autowired
    FoxController(FoxService service) {
        this.service = service;
    }

    @GetMapping("/nutritionStore")
    public String nutrition(@RequestParam String name, Model model) {
        if (name == null || service.getFox(name) == null)
            return "login";
        else {
            model.addAttribute("fox", service.getFox(name));
            model.addAttribute("nutrition", true);
            return "index";
        }
    }

    @PostMapping("/nutritionStore")
    public String nutritionChange(@RequestParam String name, @RequestParam Foods food,
                                  @RequestParam Drinks drink) {
        if (name == null || service.getFox(name) == null)
            return "login";
        else {
            service.getFox(name).setDrink(drink);
            service.getFox(name).setFood(food);
            return "redirect:/?name=" + name;
        }
    }

}
