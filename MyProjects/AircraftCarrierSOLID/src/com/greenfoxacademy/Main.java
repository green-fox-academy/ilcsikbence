package com.greenfoxacademy;

public class Main {
  public static void main(String[] args) {
    Fightable carrier = new Carrier(10000, 1000);
    Fightable carrier2 = new Carrier(10000, 1000);
    Fightable camp = new Camp(20000);
    testCase();
  }

  public static void throwsException() throws MyException {
    
  }

  public static void testCase() {
    try {
      throwsException();
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}
