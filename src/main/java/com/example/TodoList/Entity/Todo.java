package com.example.TodoList.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed;

//    public Long getId(){
//        return id
//    }
//
    public void setId(Long id) {
        this.id = id;
    }
}
