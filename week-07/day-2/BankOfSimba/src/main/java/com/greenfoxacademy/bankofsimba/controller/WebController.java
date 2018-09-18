package com.greenfoxacademy.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  @GetMapping("/show")
  public String showFields() {

    return "bank-account-info";
  }
}