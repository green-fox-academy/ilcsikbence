package com.greenfoxacademy.todoadvanced.services;

import com.greenfoxacademy.todoadvanced.models.Todo;

import java.util.List;

public interface TodoService {
  List<Todo> getTodos();
  void save(Todo todo);
  boolean validateTodo(Todo todo);
}
