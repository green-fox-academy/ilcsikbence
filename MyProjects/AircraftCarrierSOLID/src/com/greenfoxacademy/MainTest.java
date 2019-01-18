package com.greenfoxacademy;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MainTest {

  Carrier carrier = new Carrier(1000, 2000);
  FighterJet fighterJet = new FighterJet(200,300,400);

  @BeforeEach
  public void init() {
    carrier.addMovable(fighterJet);
  }

  @After
  public void destroy() {
    carrier.setMovables(null);
    carrier.setStoredAmmo(1000);
    carrier.setHealthPoint(2000);
    fighterJet.setCurrentAmmo(200);
    fighterJet.setMaxAmmo(300);
    fighterJet.setBaseDamage(400);
  }
}