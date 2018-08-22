public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
    numOfLegs = 2;
    canFly = true;
  }

  public Bird(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    numOfLegs = 2;
    canFly = true;
  }

  public String breed() {
    return "laying eggs.";
  }
}