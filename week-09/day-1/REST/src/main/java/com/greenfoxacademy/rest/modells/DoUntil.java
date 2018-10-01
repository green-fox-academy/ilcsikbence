package com.greenfoxacademy.rest.modells;

public class DoUntil {
  private Integer result;

  public DoUntil() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public Integer sum(Integer until) {
    result = 0;
    for (int i = 0; i <= until; i++) {
      result += i;
    }
    return result;
  }

  public Integer factor(Integer until) {
    result = until;

    for (int i = until - 1; i > 0; i--) {
      result *= i;
    }

    return result;
  }

}
