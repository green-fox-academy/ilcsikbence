public class Animal {

  public Animal() {
    hungerDef = 50;
    thirstDef = 50;
  }

  private int hungerDef;
  private int thirstDef;


  public int hunger() {
    return hungerDef;
  }

  public int thirst() {
    return thirstDef;
  }

  public int eat() {
    hungerDef = hungerDef - 1;
    return hungerDef;
  }

  public int drink() {
    thirstDef = thirstDef - 1;
    return thirstDef;
  }



}
