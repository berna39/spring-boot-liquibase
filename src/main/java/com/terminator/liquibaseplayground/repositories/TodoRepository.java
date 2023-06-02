package com.terminator.liquibaseplayground.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.terminator.liquibaseplayground.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    
}
