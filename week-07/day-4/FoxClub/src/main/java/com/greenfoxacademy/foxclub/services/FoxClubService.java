package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;

public interface FoxClubService {
  Fox getFoxByName(String name);
  Fox getFoxByIndex(int i);
}
