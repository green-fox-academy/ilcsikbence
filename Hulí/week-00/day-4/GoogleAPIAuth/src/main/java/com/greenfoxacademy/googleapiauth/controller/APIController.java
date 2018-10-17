package com.greenfoxacademy.googleapiauth.controller;

import com.greenfoxacademy.googleapiauth.models.User;
import com.greenfoxacademy.googleapiauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
  @Autowired
  UserRepository userRepository;

  @GetMapping("/users")
  List<User> getUsers(User user) {
    return (List<User>) userRepository.findAll();
  }

  @GetMapping("/user")
  Principal getPrincipalUser(Principal principal) {
    return principal;
  }
}
