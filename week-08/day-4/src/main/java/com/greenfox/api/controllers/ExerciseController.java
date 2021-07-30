package com.greenfox.api.controllers;


import com.greenfox.api.models.*;
import com.greenfox.api.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class ExerciseController {

    private final LogService logService;

    @Autowired
    public ExerciseController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> multiply2(@RequestParam(required = false) Integer input) {
        logService.add(new Log("/doubling", "input=" + input));
        if (input == null)
            return ResponseEntity.ok(new Errors("Please provide an input!"));

        else
            return ResponseEntity.ok(new Doubling(input));
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> awesomeGreeting(@RequestParam(required = false) String name,
                                             @RequestParam(required = false) String title) {
        logService.add(new Log("/greeter", "name=" + name + ":title=" + title));
        if (name == null && title == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide a name and a title!"));
        } else if (name == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide a name!"));
        } else if (title == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide a title!"));
        } else {
            return ResponseEntity.ok().body(new AwesomeGreeting(name, title));
        }
    }

    @GetMapping("/appenda/{text}")
    public ResponseEntity<?> appendingA(@PathVariable String text) {
        logService.add(new Log("/appenda", "text=" + text));
        return ResponseEntity.ok(new AppendA(text));
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity<?> doUntil(@PathVariable String operation, @RequestBody Map<String, Integer> payload) {
        logService.add(new Log("/dountil", "operation=" + operation + ":until=" + payload.get("until").toString()));
        if (payload.isEmpty()) {
            return ResponseEntity.ok(new Errors("Please provide a number!"));
        } else {
            DoUntil operate = new DoUntil();
            operate.operate(operation, payload.get("until"));
            return ResponseEntity.ok(operate);
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrayHandler(@RequestBody WhatNumbers whatNumbers) {
        logService.add(new Log("/arrays", "what=" + whatNumbers.getWhat() + ":numbers=" + java.util.Arrays.toString(whatNumbers.getNumbers())));
        if (whatNumbers.getWhat() == null || whatNumbers.getNumbers() == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide what to do with the numbers!"));
        } else {
            Arrays array = new Arrays();
            array.calculate(whatNumbers.getWhat(), whatNumbers.getNumbers());
            return ResponseEntity.ok(array);
        }
    }

    @GetMapping("/log")
    public ResponseEntity<List<Log>> allLogs() {
        return ResponseEntity.ok(logService.getAll());
    }

    @PostMapping("/sith")
    public ResponseEntity<?> sithing(@RequestBody Sith load) {
        if (load == null)
            return ResponseEntity.ok(new Errors("Feed me some text you have to, padawan young you are. Hmmm."));
        else {
            logService.add(new Log("/sith", "text=" + load.getText()));
            load.setSithTextbla();
            return ResponseEntity.ok(load);
        }
    }

    @PostMapping("/translate")
    public ResponseEntity<?> translations(@RequestBody Translation translation) {
        if (translation == null)
            return ResponseEntity.ok(new Errors("I can't translate that!"));
        else {
            logService.add(new Log("/translate", "text=" + translation.getText() + ":lang=" + translation.getLang()));
            translation.translate();
            return ResponseEntity.ok(translation);
        }
    }
}