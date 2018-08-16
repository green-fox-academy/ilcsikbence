public class Main {
  public static void main(String[] args) {
    Car newCar = new Car();
    Station newStation = new Station();
    newStation.refill(newCar.capacity, newCar.gasAmount);
  }
}
