package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isBad;

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public BankAccount() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    DecimalFormat df = new DecimalFormat("0.00");
    return df.format(balance) + " Zebra";
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isBad() {
    return isBad;
  }

  public void setBad(boolean bad) {
    isBad = bad;
  }
}