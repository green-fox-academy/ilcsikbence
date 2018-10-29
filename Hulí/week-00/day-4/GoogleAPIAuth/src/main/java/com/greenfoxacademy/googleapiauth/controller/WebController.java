package com.greenfoxacademy.googleapiauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
  @GetMapping(value = "/test")
  public String getTestPage() {
    return "test";
  }
}
