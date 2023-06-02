package com.terminator.liquibaseplayground.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="todos")
@Data
public class Todo {
    
    @Id
    private int id;
    private String title;
}
