package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.modells.*;
import com.greenfoxacademy.rest.modells.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping(value = "/dountil/{action}")
  public Object postDoUntil(@PathVariable(value = "action") String action,
                            @RequestBody UntilNumber until) {

    if (until == null) {
      return new Error("Please provide a number");
    }

    if (action.equals("sum")) {
      DoUntil doUntil = new DoUntil();
      doUntil.setResult(doUntil.sum(until.getUntil()));
      return doUntil;
    }

    if (action.equals("factor")) {
      DoUntil doUntil = new DoUntil();
      doUntil.setResult(doUntil.factor(until.getUntil()));
      return doUntil;
    }

    return new Error("Please provide an action!");
  }
}
