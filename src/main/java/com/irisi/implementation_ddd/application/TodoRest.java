package com.irisi.implementation_ddd.application;

import com.irisi.implementation_ddd.domain.service.TodoService;
import com.irisi.implementation_ddd.infra.entity.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/v1")
public class TodoRest {
    private final TodoService todoService;

    public TodoRest(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/")
    public Todo save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @GetMapping("/")
    public List<Todo> findAll() {
        return todoService.findAll();
    }
}
