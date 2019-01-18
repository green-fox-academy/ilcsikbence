package com.greenfoxacademy;

public abstract class Fightable extends Vehicle {
  protected int healthPoint;

  public Fightable(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  abstract void fight(Fightable fightable);

}
