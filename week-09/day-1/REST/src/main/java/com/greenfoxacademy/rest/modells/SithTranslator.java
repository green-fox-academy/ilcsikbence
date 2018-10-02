package com.greenfoxacademy.rest.modells;

public class SithTranslator {
  private String text;

  public SithTranslator(String text) {
    this.text = text;
  }

  public SithTranslator() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
