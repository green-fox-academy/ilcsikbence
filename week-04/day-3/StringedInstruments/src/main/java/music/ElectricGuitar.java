package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    numOfStrings = 6;
    name = "Electric Guitar";
  }

  public ElectricGuitar(int numOfStrings) {
    this.numOfStrings = numOfStrings;
    name = "Electric Guitar";
  }

  public void sound() {
    System.out.println("Twang");
  }
}