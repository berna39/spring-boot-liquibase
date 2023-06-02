package com.terminator.liquibaseplayground.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terminator.liquibaseplayground.models.Todo;
import com.terminator.liquibaseplayground.services.TodoService;


@RestController
@RequestMapping("/api/v1")
public class TodoController {

    @Autowired
    private TodoService todoService;
    

    @GetMapping("/")
    public ResponseEntity<List<Todo>> index(){
        List<Todo> todos = todoService.getAllTodo();
        return ResponseEntity.ok(todos);
    }
}
