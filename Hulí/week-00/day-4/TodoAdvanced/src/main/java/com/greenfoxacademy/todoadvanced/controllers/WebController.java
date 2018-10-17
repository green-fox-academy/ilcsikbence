package com.greenfoxacademy.todoadvanced.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
  @GetMapping(value = "/login")
  public String getLoginPage() {
    return "login";
  }
}
