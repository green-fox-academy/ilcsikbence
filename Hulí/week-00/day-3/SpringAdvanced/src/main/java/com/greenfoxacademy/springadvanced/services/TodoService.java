package com.greenfoxacademy.springadvanced.services;

import com.greenfoxacademy.springadvanced.models.Todo;

import java.util.List;

public interface TodoService {
  List<Todo> getTodos();
  void save(Todo todo);
  boolean validateTodo(Todo todo);
}
