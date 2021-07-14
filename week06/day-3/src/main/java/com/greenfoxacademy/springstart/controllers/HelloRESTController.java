package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.classes.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong counter = new AtomicLong(0);

    @RequestMapping("greeting")
    public Greeting greeting (@RequestParam String name) {
        return new Greeting(counter.incrementAndGet(), "Hello, " + name);
    }

}
