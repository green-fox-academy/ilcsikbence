package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping(value = "/")
  public String getMainPage() {
    return "index";
  }

  @GetMapping
  public String getLoginPage() {
    return "login";
  }
}