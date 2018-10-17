package com.greenfoxacademy.springadvanced.controllers;

import com.greenfoxacademy.springadvanced.dtos.ResultResponse;
import com.greenfoxacademy.springadvanced.models.Todo;
import com.greenfoxacademy.springadvanced.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class APIController {
  private final TodoService todoService;

  @Autowired
  public APIController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = "/todo/list")
  public Object getTodos() {
    return todoService.getTodos();
  }

  @PostMapping(value = "/todo/new")
  public ResponseEntity<?> saveTodo(@RequestBody Todo todo) {
    if (todoService.validateTodo(todo)) {
      todoService.save(todo);
      return ResponseEntity.ok(new ResultResponse("Todo was saved."));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResultResponse("Couldn't save todo."));
  }

}
