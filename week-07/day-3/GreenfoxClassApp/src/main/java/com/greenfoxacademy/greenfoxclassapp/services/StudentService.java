package com.greenfoxacademy.greenfoxclassapp.services;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
  public void save(String student);
  public List<String> findAll();
}
