package com.greenfoxacademy.googleapiauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class APIController {
  @GetMapping("/user")
  Principal getPrincipalUser(Principal principal) {
    saveUser(principal);
    return principal;
  }

  private void saveUser(Principal principal) {
    System.out.println(principal.toString());
  }
}
