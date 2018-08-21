public class Flower {

  private double currentWater;
  private String name;

  public Flower(String name) {
    currentWater = 0;
    this.name = name;
  }

  public void waterStatus() {
    if (this.currentWater < 5) {
      System.out.println("The " + name + " Flower needs water.");
    } else {
      System.out.println("The " + name + " Flower doesn't need water.");
    }
  }

  public double toWater(double waterAmount) {
    if (currentWater < 5) {
      currentWater = currentWater + waterAmount * 0.75;
    } else {
      currentWater += 0;
    }
    return currentWater;
  }
}
