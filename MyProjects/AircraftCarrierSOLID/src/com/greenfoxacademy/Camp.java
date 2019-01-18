package com.greenfoxacademy;

public class Camp extends Fightable {
  public Camp(int healthPoint) {
    super(healthPoint);
  }

  @Override
  void fight(Fightable fightable) {
    fightable.healthPoint -= 50;
  }
}
