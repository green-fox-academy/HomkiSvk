package com.greenfoxacademy.day2di.usefulUtilities.controllers;

import com.greenfoxacademy.day2di.usefulUtilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeUtilitiesController {

    private final UtilityService service;

    @Autowired
    HomeUtilitiesController(UtilityService service) {
        this.service = service;
    }

    @GetMapping("/useful")
    public String homePage() {
        return "indexUtil";
    }

    @GetMapping("/useful/colored")
    public String homePageColored(Model model) {
        model.addAttribute("color", service.randomColor());
        return "indexUtil";
    }

    @GetMapping("/useful/email")
    public String homePageEmail(Model model, @RequestParam String email) {
        model.addAttribute("isValid", service.validateEmail(email));
        model.addAttribute("email", email);
        return "indexUtil";
    }

    @PostMapping("/useful/email")
    public String emailVerify (Model model, @RequestParam String email) {
        model.addAttribute("isValid", service.validateEmail(email));
        model.addAttribute("email", email);
        return "indexUtil";
    }

    @PostMapping("/useful/encoder")
    public String postCode(Model model, @RequestParam String word, Integer number) {
        model.addAttribute("encodedWord", service.caesar(word, number));
        return "indexUtil";
    }

    @PostMapping("/useful/decoder")
    public String getCode(Model model, @RequestParam String word, Integer number) {
        model.addAttribute("encodedWord", service.caesar(word, -number));
        return "indexUtil";
    }

}
