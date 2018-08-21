public class Tree {

  private double currentWater;
  private String name;

  public Tree(String name) {
    currentWater = 0;
    this.name = name;
  }

  public void waterStatus() {
    if (this.currentWater < 10) {
      System.out.println("The " + name + " Tree needs water.");
    } else {
      System.out.println("The " + name + " Tree doesn't need water.");
    }
  }

  public double toWater(double waterAmount) {
    if (currentWater < 10) {
      currentWater = currentWater + waterAmount * 0.4;
    } else {
      currentWater += 0;
    }
    return currentWater;
  }
}