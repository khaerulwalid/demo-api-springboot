package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class WelcomeController {

    @GetMapping()
    public String welcome() {
        return "Welcome to Spring boot Rest Api";
    }
}
