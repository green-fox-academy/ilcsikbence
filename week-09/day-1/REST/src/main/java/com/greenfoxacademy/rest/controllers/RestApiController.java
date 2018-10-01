package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.modells.AppendA;
import com.greenfoxacademy.rest.modells.Doubling;
import com.greenfoxacademy.rest.modells.Error;
import com.greenfoxacademy.rest.modells.WelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

  @GetMapping(value = "/doubling")
  public Object getDoublingValues(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping(value = "/greeter")
  public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "title", required = false) String title) {
    if (name == null || title == null) {
      return new Error("Please provide a name!");
    }
    return new WelcomeMessage(name, title);
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object getAppendA(@PathVariable(value = "appendable") String appendable) {
    if (appendable == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND);
    }
    return new AppendA(appendable);
  }

  
}
