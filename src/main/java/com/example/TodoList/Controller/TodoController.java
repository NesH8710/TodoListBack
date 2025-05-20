package com.example.TodoList.Controller;

import com.example.TodoList.Repository.TodoRepository;
import com.example.TodoList.Entity.Todo;
import com.example.TodoList.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*") //允許前端跨域存取
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return service.create(todo);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo todo) {
        return service.update(id, todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PatchMapping
    public Todo toggleComplete(@PathVariable Long id) {
        return service.toggleComplete(id);
    }
}
