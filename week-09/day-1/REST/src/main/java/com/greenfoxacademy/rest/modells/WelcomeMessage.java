package com.greenfoxacademy.rest.modells;

public class WelcomeMessage {
  private String welcome_message;

  public WelcomeMessage(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my " + title + "!";
  }

  public WelcomeMessage() {
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
