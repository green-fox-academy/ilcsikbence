package com.greenfoxacademy;

public class MyException extends Exception {
  protected MyException() {
    super("Hello World", new Throwable("I don't know the cause"), true, true);
  }

}
