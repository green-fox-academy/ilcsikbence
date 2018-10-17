package com.greenfoxacademy.todoadvanced.controllers;

import com.greenfoxacademy.todoadvanced.dtos.ResultResponse;
import com.greenfoxacademy.todoadvanced.models.Todo;
import com.greenfoxacademy.todoadvanced.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
  @PreAuthorize("hasAnyRole('USER')")
  public Object getTodos() {
    return todoService.getTodos();
  }

  @PostMapping(value = "/todo/new")
  @PreAuthorize("hasAnyRole('USER')")
  public ResponseEntity<?> saveTodo(@RequestBody Todo todo) {
    if (todoService.validateTodo(todo)) {
      todoService.save(todo);
      return ResponseEntity.ok(new ResultResponse("Todo was saved."));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResultResponse("Couldn't save todo."));
  }

}
