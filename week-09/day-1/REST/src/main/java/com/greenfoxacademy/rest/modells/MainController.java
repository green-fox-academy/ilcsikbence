package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping (value = "/")
  public String getIndexPage() {
    return "index.html";
  }
}