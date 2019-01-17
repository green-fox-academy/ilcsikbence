package com.greenfoxacademy.googleapiauth.controller;

import com.greenfoxacademy.googleapiauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@Controller
public class WebController {
  @Autowired UserRepository userRepository;

  @GetMapping(value = "/test")
  public String getTestPage() {
    return "test";
  }

  @GetMapping(value = "/index")
  public String getMain() {
    return "index";
  }

  @GetMapping("/logout")
  public String logout(HttpServletRequest request, HttpServletResponse response) {
    new SecurityContextLogoutHandler().logout(request, null, null);
    return "redirect:/";
  }
}
