public class Main {
  public static void main(String[] args) {
    Bird bird = new Bird("Birdie");
    bird.takeOff();
    bird.fly();
    bird.land();

    Helicopter helicopter = new Helicopter("Apache");
    System.out.println(helicopter.numOfWheels);
    System.out.println(helicopter.colorOfVehicle);
    helicopter.setAge(2);
    System.out.println(helicopter.ageOfVehicle);
    System.out.println(helicopter.typeOfVehicle);
    helicopter.takeOff();
    helicopter.fly();
    helicopter.land();
  }
}
