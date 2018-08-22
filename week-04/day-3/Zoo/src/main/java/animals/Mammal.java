package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
    numOfLegs = 4;
    canFly = false;
  }

  public Mammal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    numOfLegs = 4;
    canFly = false;
  }

  public String breed() {
    return "giving birth to live young.";
  }
}