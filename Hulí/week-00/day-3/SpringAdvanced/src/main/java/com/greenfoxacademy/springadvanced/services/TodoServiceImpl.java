package com.greenfoxacademy.springadvanced.services;

import com.greenfoxacademy.springadvanced.models.Todo;
import com.greenfoxacademy.springadvanced.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  private final TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> getTodos() {
    return todoRepository.findAll();
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public boolean validateTodo(Todo todo) {
    if (todo.getContent() == null || todo.getContent().equals("") || todo.getDone() == null || todo.getUrgent() == null) {
      return false;
    }
    return true;
  }
}
