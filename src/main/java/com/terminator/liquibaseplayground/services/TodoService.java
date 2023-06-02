package com.terminator.liquibaseplayground.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminator.liquibaseplayground.models.Todo;
import com.terminator.liquibaseplayground.repositories.TodoRepository;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodo(){
        return todoRepository.findAll();
    }
}
