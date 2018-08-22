public class Bird extends Animal implements Flyable{

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

  @Override
  public void land() {
    System.out.println(name + " landed on the ground.");
  }

  @Override
  public void fly() {
    System.out.println(name + " flies far away.");
  }

  @Override
  public void takeOff() {
    System.out.println(name + " flies up.");
  }
}