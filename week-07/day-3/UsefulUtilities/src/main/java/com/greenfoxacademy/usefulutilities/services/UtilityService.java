package com.greenfoxacademy.usefulutilities.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String getColor(String color) {
    for (int i = 0; i < colors.size(); i++) {
      if (colors.get(i).equals(color)) {
        return colors.get(i);
      }
    }
    return null;
  }

  public boolean validateEmail(String email) {
    if (email.contains(".") && email.contains(".")) {
      return true;
    } else {
      return false;
    }
  }

  public String getEmail(String email) {
    return email;
  }
}