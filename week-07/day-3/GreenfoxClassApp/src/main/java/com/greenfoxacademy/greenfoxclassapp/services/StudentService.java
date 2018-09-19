package com.greenfoxacademy.greenfoxclassapp.services;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
  void save(String student);
  List<String> findAll();
  int count();
}
