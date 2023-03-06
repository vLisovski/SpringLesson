package com.example.gotodos.repository;

import com.example.gotodos.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemsRepository extends JpaRepository<TodoItem, Integer> {

}
