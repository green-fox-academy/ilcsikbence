package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;
  private List<Message> messages;
  private String imagePath;

  public Fox(String name, List<String> tricks, String food, String drink, String imagePath) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
    this.messages = new ArrayList<>();
    this.imagePath = imagePath;
  }

  public Fox() {
    this.tricks = new ArrayList<>();
    this.food = "pizza";
    this.drink = "Coca Cola";
    this.messages = new ArrayList<>();
    this.imagePath = "greenfox.png";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }
}