package com.greenfoxacademy.springadvanced.dtos;

import com.greenfoxacademy.springadvanced.models.Todo;

import java.util.List;

public class Todos {
  List<Todo> todos;

  public Todos(List<Todo> todos) {
    this.todos = todos;
  }

  public Todos() {
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
