package com.terminator.liquibaseplayground.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class TodoController {
    

    @GetMapping("/")
    public String index(){
        return "Hello from the API";
    }
}
