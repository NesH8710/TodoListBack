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
    private boolean completed = false;


    public void setId(Long id) {
        this.id = id;
    }

    public void setIsCompleted(boolean b) {
    }

    public boolean getIsCompleted() {
        return false;
    }
}
