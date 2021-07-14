package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong counter = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("thisIs", " This side was loaded " + counter.incrementAndGet()
                + " times since last server start.");
        return "greeting";
    }
}
