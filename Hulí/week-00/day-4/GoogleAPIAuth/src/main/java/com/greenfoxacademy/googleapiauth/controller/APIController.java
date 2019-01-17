package com.greenfoxacademy.googleapiauth.controller;

import com.greenfoxacademy.googleapiauth.models.User;
import com.greenfoxacademy.googleapiauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
  @Autowired UserRepository userRepository;

  @GetMapping("/users")
  List<User> getUsers(User user) {
    return (List<User>) userRepository.findAll();
  }

  @GetMapping("/user")
  Principal getPrincipalUser(Principal principal) {
    return principal;
  }

  @GetMapping("/getEmail")
  public Object user(OAuth2Authentication authentication) {
    LinkedHashMap<String, Object> properties =
        (LinkedHashMap<String, Object>) authentication.getUserAuthentication().getDetails();
    System.out.println(properties.get("email"));
    return properties.get("email");
  }
}
