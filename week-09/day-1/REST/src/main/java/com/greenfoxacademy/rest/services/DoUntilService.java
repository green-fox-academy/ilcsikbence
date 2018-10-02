package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.DoUntil;

public interface DoUntilService {
  void factor(Integer until, DoUntil doUntil);
  void sum(Integer until, DoUntil doUntil);
}
