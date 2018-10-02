package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.DoUntil;
import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService {
  @Override
  public void factor(Integer until, DoUntil doUntil) {
    Integer result = until;
    for (int i = until - 1; i > 0; i--) {
      result *= i;
    }

    doUntil.setResult(result);
  }

  @Override
  public void sum(Integer until, DoUntil doUntil) {
    Integer result = 0;
    for (int i = 0; i <= until; i++) {
      result += i;
    }

    doUntil.setResult(result);
  }
}
