package com.greenfoxacademy.rest.modells;

import org.springframework.http.ResponseEntity;

public class AppendA {
  private String appended;

  public AppendA(String appendable) {
    this.appended = appendable + 'a';
  }

  public String getAppended() {
    return appended;
  }

}
