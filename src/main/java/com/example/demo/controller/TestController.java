package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping()
    public String test() {
        return "<h1>Hello Spring!!!</h1><h2>Server is running...</h2><h3>CI TEST</h3>";
    }
}
