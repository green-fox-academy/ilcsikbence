package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    numOfStrings = 4;
    name = "Bass Guitar";
  }

  public BassGuitar(int numOfStrings) {
    this.numOfStrings = numOfStrings;
    name = "Bass Guitar";
  }

  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}