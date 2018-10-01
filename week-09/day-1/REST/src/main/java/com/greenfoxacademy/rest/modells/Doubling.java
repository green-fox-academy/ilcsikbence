package com.greenfoxacademy.rest.modells;

public class Doubling {
  private int recieved;
  private int result;

  public Doubling(int recieved) {
    this.recieved = recieved;
  }

  public Doubling() {

  }

  public int getRecieved() {
    return recieved;
  }

  public void setRecieved(int recieved) {
    this.recieved = recieved;
  }

  public int getResult() {
    result = recieved * 2;
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
