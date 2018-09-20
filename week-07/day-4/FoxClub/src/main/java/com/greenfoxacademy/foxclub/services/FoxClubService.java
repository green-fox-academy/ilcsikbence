package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;

import java.util.List;

public interface FoxClubService {
  Fox getFoxByName(String name);
  Fox getFoxByIndex(int i);
  void changeFood(String name, String food);
  void changeDrink(String name, String drink);
  List<String> changesList(String name);
}
