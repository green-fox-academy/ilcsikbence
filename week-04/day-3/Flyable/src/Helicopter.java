public class Helicopter extends Vehicle {

  public Helicopter (String typeOfVehicle) {
    this.typeOfVehicle = typeOfVehicle;
    colorOfVehicle = "Camoflagued";
    numOfWheels = 3;
  }

  @Override
  public void land() {
    System.out.println(typeOfVehicle + " type helicopter landed on the ground");
  }

  @Override
  public void fly() {
    System.out.println(typeOfVehicle + " flies far away.");
  }

  @Override
  public void takeOff() {
    System.out.println(typeOfVehicle + " type helicopter took off from the ground");
  }

  public int setNumOfWheels(int numOfWheels) {
    this.numOfWheels = numOfWheels;
    return this.numOfWheels;
  }

  public String setName(String typeOfVehicle) {
    this.typeOfVehicle = typeOfVehicle;
    return this.typeOfVehicle;
  }

  public int setAge(int ageOfVehicle) {
    this.ageOfVehicle = ageOfVehicle;
    return this.ageOfVehicle;
  }

  public String setColor(String colorOfVehicle) {
    this.colorOfVehicle = colorOfVehicle;
    return this.colorOfVehicle;
  }
}
