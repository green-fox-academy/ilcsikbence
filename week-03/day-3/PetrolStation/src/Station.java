public class Station {

  public Station() {
    gasAmount = 100;
  }

  int gasAmount;

  public void refill(int capacity, int gasAmount) {
    System.out.println(capacity - 1);
    System.out.println(gasAmount + 1);
  }
}
