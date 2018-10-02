package com.greenfoxacademy.matrix.controllers;

import com.greenfoxacademy.matrix.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  MatrixService matrixService;
  Boolean isValid;

  @Autowired
  public MainController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String getMainPage(Model model) {
    model.addAttribute("isValid", isValid);
    return "index";
  }

  @PostMapping("/matrix")
  public String receiveValidateSaveMatrices(@RequestParam(value = "textArea") String textArea) {
    if (matrixService.validateMatrix(textArea)) {
      matrixService.saveMatrix(matrixService.createMatrix(textArea));
      isValid = true;
    } else {
      isValid = false;
    }
    return "redirect:";
  }
}