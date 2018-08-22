package main.java.music;

public abstract class StringedInstrument extends Instrument {
  public int numOfStrings;

  public abstract void sound();

  protected void play() {
    System.out.print(name + ", a " + this.numOfStrings + "-stringed instrument that goes ");
    sound();
  }
}