package com.greenfoxacademy.springstart;

public class Hello {
  String color;
  String fontSize;
  String text;

  public Hello(String color, String fontSize) {
    this.color = color;
    this.fontSize = fontSize;
  }

  public Hello(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }
}
