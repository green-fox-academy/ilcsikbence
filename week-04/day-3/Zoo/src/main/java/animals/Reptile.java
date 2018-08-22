package main.java.animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
    numOfLegs = 4;
    canFly = false;
  }

  public Reptile(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    numOfLegs = 4;
    canFly = false;
  }

  public String breed() {
    return "laying eggs.";
  }
}