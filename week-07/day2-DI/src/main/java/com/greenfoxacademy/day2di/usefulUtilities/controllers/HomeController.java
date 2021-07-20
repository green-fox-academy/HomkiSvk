package com.greenfoxacademy.day2di.usefulUtilities.controllers;

import com.greenfoxacademy.day2di.usefulUtilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final UtilityService service;

    @Autowired
    HomeController(UtilityService service) {
        this.service = service;
    }

    @GetMapping("/useful")
    public String homePage() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String homePageColored(Model model) {
        model.addAttribute("color", service.randomColor());
        return "index";
    }

    @GetMapping("/useful/email")
    public String homePageEmail(Model model, @RequestParam String email) {
        model.addAttribute("isValid", service.validateEmail(email));
        model.addAttribute("email", email);
        return "index";
    }

    @PostMapping("/useful/email")
    public String emailVerify (Model model, @RequestParam String email) {
        model.addAttribute("isValid", service.validateEmail(email));
        model.addAttribute("email", email);
        return "index";
    }

    @PostMapping("/useful/encoder")
    public String postCode(Model model, @RequestParam String word, Integer number) {
        model.addAttribute("encodedWord", service.caesar(word, number));
        return "index";
    }

    @PostMapping("/useful/decoder")
    public String getCode(Model model, @RequestParam String word, Integer number) {
        model.addAttribute("encodedWord", service.caesar(word, -number));
        return "index";
    }

}
