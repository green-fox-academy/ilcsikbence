package com.greenfoxacademy.todoadvanced.services;

import com.greenfoxacademy.todoadvanced.models.Todo;
import com.greenfoxacademy.todoadvanced.repositories.TodoRepository;
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
    if (todo.getContent() == null || todo.getContent().equals("")) {
      return false;
    }
    return true;
  }
}
