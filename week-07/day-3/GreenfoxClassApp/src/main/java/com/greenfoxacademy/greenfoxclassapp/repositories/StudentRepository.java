package com.greenfoxacademy.greenfoxclassapp.repositories;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class StudentRepository {
  List<String> studentLines;
  Path path;

  public StudentRepository() {
    path = Paths.get("students.txt");

    try {
      studentLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<String> getStudentLines() {
    return studentLines;
  }

  public void setStudentLines(List<String> studentLines) {
    this.studentLines = studentLines;
  }

  public Path getPath() {
    return path;
  }

  public void setPath(Path path) {
    this.path = path;
  }
}