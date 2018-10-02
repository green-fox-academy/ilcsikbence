package com.greenfoxacademy.matrix.controllers;

import com.greenfoxacademy.matrix.modells.Matrices;
import com.greenfoxacademy.matrix.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
  MatrixService matrixService;

  @Autowired
  public MainRestController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping(value = "/matrices")
  public Object getMatrices() {
    Matrices matrices = new Matrices(matrixService.showMatrices());
    return matrices;
  }
}