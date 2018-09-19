package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  StudentService studentService;

  public WebController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(value = "/gfa")
  public String getMainPage() {
    return "main";
  }

  @GetMapping(value = "/gfa/list")
  public String getAllStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list-of-students";
  }
}
