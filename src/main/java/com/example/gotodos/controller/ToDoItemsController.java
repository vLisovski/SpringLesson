package com.example.gotodos.controller;

import com.example.gotodos.model.TodoItem;

import com.example.gotodos.service.TodoItemsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path="/todos")
@AllArgsConstructor
public class ToDoItemsController {

    private final TodoItemsService todoItemsService;

    @GetMapping(value = "/getAll")
    public List<TodoItem> getAll() {

        return todoItemsService.getAll();
    }

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody TodoItem todoItem){
        todoItemsService.addNew(todoItem);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id){
        todoItemsService.deleteById(id);

    }
}
