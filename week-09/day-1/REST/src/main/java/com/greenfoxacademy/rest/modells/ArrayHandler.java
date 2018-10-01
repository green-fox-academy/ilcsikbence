package com.greenfoxacademy.rest.modells;

import java.util.List;

public class ArrayHandler {
  private String what;
  private List<Integer> numbers;

  public ArrayHandler(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayHandler() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }
}
