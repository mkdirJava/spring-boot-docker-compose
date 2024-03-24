package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class DemoController {

    private String message = "today";
    @GetMapping("/")
    ResponseEntity<String> Message() {
        return new ResponseEntity<>("!!!ICE-CREAdM-this-is-nope!!! %s".formatted(message), OK);
    }
}
