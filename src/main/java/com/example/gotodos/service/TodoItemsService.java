package com.example.gotodos.service;

import com.example.gotodos.model.TodoItem;
import com.example.gotodos.repository.TodoItemsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class TodoItemsService {
    private final TodoItemsRepository todoItemsRepository;

    public List<TodoItem> getAll(){
        return todoItemsRepository.findAll();
    }

    public void addNew(TodoItem todoItem){
        todoItemsRepository.save(todoItem);
    }

    public void deleteById(int id){
        todoItemsRepository.deleteById(id);
    }
}
