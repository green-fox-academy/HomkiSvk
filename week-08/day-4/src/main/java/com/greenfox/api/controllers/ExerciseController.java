package com.greenfox.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.api.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class ExerciseController {

    @GetMapping("/doubling")
    public ResponseEntity<?> multiply2(@RequestParam (required = false) Integer input) {
        if (input == null)
            return ResponseEntity.ok(new Errors("Please provide an input!"));

        else
            return ResponseEntity.ok(new Doubling(input));
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> awesomeGreeting(@RequestParam (required = false) String name,
                                             @RequestParam (required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide a name and a title!"));
        }else if (name == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide a name!"));
        } else if (title == null) {
            return ResponseEntity.badRequest().body(new Errors("Please provide a title!"));
        }else {
            return ResponseEntity.ok().body(new AwesomeGreeting(name, title));
        }
    }

    @GetMapping ("/appenda/{text}")
    public ResponseEntity<?> appendingA(@PathVariable String text) {
        return ResponseEntity.ok(new AppendA(text));
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity<?> doUntil(@PathVariable String operation, @RequestBody Map<String, Integer> payload) {
        if (payload.isEmpty()){
            return ResponseEntity.ok(new Errors("Please provide a number!"));
        }else {
            DoUntil operate = new DoUntil();
            operate.operate(operation, payload.get("until"));
            return ResponseEntity.ok(operate);
        }
    }

}
