package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong greetingCounter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    Greeting greeting = new Greeting(greetingCounter.incrementAndGet(), name);
    return greeting;
  }
}
