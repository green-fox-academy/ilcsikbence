package com.greenfoxacademy.fragment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
  @GetMapping(value = "/")
  public String getMainPage() {
    return "index";
  }

  @GetMapping(value = "/test1")
  public String testOnePage() {
    return "test1";
  }

  @GetMapping(value = "/test2")
  public String testTwoPage() {
    return "test2";
  }

  @GetMapping(value = "/test3")
  public String testThreePage() {
    return "test3";
  }

  @GetMapping(value = "/test4")
  public String testFourPage() {
    return "test4";
  }

}
