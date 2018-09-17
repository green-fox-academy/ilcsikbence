package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong greetingCounter = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam(value = "name", defaultValue = " World")  String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("id", greetingCounter);
    return "greeting";
  }
}
