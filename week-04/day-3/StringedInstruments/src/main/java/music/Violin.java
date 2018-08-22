package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    numOfStrings = 4;
    name = "Violin";
  }

  public void sound() {
    System.out.println("Screech");
  }
}