package com.greenfoxacademy.usefulutilities.controllers;

import com.greenfoxacademy.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebContoller {
  UtilityService utilityService;

  @Autowired
  public WebContoller(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful")
  public String mainPage(Model model, String color) {
    model.addAttribute("color", utilityService.getColor(color));
    return "main";
  }

//  @PostMapping(value = "/useful/color")
//  public String showColor(Model model, @RequestMapping(value = "color") String color) {
//    return "redirect: useful";
//  }

  @GetMapping(value = "/useful/colored")
  public String allColorsPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "random-colored-background";
  }

  @GetMapping(value = "/useful/email")
  public String emailValidation(Model model, @RequestParam(value = "email") String email) {
    model.addAttribute("string", email);
    model.addAttribute("email", utilityService.validateEmail(email));
    return "valid-email";
  }

}