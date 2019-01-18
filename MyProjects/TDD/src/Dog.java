public class Dog {
  private String name;
  private int hunger;
  private int thirst;

  public Dog(String name) {
    this.name = name;
    this.hunger = 10;
    this.thirst = 10;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }
}
