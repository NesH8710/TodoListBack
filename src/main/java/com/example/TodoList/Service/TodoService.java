package com.example.TodoList.Service;

import com.example.TodoList.Entity.Todo;
import com.example.TodoList.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repo;

    public List<Todo> getAll() {
        return repo.findAll();
    }

    public Todo create(Todo todo) {
        return repo.save(todo);
    }

    public Todo update(Long id, Todo todo) {
        todo.setId(id);
        return repo.save(todo);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Todo toggleComplete(Long id){
        Todo todo =repo.findById(id).orElseThrow();
        todo.setIsCompleted(!todo.getIsCompleted());
        return repo.save(todo);
    }
}
