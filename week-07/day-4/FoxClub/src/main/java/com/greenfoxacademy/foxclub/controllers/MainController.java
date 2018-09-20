package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  FoxClubService foxClubService;

  @Autowired
  public MainController(FoxClubService foxClubService) {
    this.foxClubService = foxClubService;
  }

  @GetMapping(value = "/")
  public String getMainPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null)
      return "login";
    else
      model.addAttribute("fox", foxClubService.getFoxByName(name));
      return "index";
  }

  @GetMapping(value = "/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String postLoginPage(@RequestParam(value = "name") String name) {
    if (!name.equals(""))
      return "redirect:?name=" + name;
    else
      return "redirect:login";
  }

  @GetMapping(value = "/nutritionStore")
  public String getNutritionStorePage() {
    return "nutrition-store";
  }

  @PostMapping(value = "/nutritionStore")
  public String postNutritionStorePage(@RequestParam(value = "food") String food, @RequestParam(value = "drink") String drink) {
    return "nutrition-store";
  }
}