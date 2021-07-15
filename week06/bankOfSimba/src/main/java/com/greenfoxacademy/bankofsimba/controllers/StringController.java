package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StringController {

    @GetMapping("/string")
    public String string(Model model) {
        model.addAttribute("text",
                "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "string";
    }
}
