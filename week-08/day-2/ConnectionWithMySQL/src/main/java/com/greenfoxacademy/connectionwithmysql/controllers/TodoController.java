package com.greenfoxacademy.connectionwithmysql.controllers;
import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/list", "/"})
  public String list(Model model,
                     @RequestParam(value = "isActive", required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("todos", todoRepository.findByDone(isActive));
    }
    return "todoslist";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/edit")
  public String getUpdateTodoPage(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id));
    return "edit-todo";
  }

  @PostMapping(value = "/{id}/edit")
  public String postUpdateTodoPage(@PathVariable(value = "id") long id,
                                   @RequestParam(value = "todoTitle") String todoTitle,
                                   @RequestParam(value = "todoUrgent", required = false) Boolean todoUrgent,
                                   @RequestParam(value = "todoDone", required = false) Boolean todoDone) {
    todoRepository.findById(id).setTitle(todoTitle);

    if (todoUrgent != null)
      todoRepository.findById(id).setUrgent(todoUrgent);
    else
      todoRepository.findById(id).setUrgent(false);

    if (todoDone != null)
      todoRepository.findById(id).setDone(todoDone);
    else
      todoRepository.findById(id).setDone(false);

    todoRepository.save(todoRepository.findById(id));
    return "redirect:/todo/";
  }

  @GetMapping(value = "/add")
  public String getNewTodoPage() {
    return "create-todo";
  }

  @PostMapping(value = "/add")
  public String addNewTodo(@RequestParam(value = "todoTitle") String todoTitle) {
    todoRepository.save(new Todo(todoTitle));
    return "redirect:/todo/";
  }
}