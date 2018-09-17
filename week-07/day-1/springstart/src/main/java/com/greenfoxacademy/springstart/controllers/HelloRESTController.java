package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    Greeting greeting = new Greeting(1, name);
    return greeting;
  }
}
