package com.greenfoxacademy.rest.modells;

public class Doubling {
  private int received;
  private int result;

  public Doubling(int received) {
    this.received = received;
  }

  public Doubling() {

  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    result = received * 2;
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
