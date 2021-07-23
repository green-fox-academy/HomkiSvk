package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Drinks;
import com.greenfoxacademy.foxclub.models.Foods;
import com.greenfoxacademy.foxclub.models.Trick;
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
        if (!(service.isValid(name)))
            return "redirect:/login";
        else {
            model.addAttribute("fragment", "nutrition");
            model.addAttribute("fox", service.getFox(name));
            return "index";
        }
    }

    @PostMapping("/nutritionStore")
    public String nutritionChange(@RequestParam String name,
                                  @RequestParam Foods food,
                                  @RequestParam Drinks drink) {
        if (!(service.isValid(name)))
            return "redirect:/login";
        else {
            service.getFox(name).setDrink(drink);
            service.getFox(name).setFood(food);
            return "redirect:/?name=" + name;
        }
    }

    @GetMapping("/trickCenter")
    public String getTrickView(@RequestParam String name, Model model) {
        if (!(service.isValid(name)))
            return "redirect:/login";
        else {
            model.addAttribute("fragment", "tricks");
            model.addAttribute("fox", service.getFox(name));
            model.addAttribute("trickList", service.getFox(name).getTricks());
            return "index";
        }
    }

    @PostMapping("/trickCenter")
    public String setTrickView(@RequestParam String name,
                               @RequestParam Trick trick) {
        if (!(service.isValid(name)))
            return "redirect:/login";
        else {
            service.getFox(name).addTrick(trick);
            return "redirect:/?name=" + name;
        }
    }
}
