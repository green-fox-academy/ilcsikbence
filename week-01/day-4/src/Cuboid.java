public class Cuboid {
  public static void main(String[] args) {

    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    double a = 1.5;
    double b = 2.5;
    double c = 3.5;

    double surfAreaCuboid = 2 * ((a * b) + (a * c) + (b * c));
    double volCuboid = a * b * c;

    System.out.println("Surface Area: " + surfAreaCuboid);
    System.out.println("Volume: " + volCuboid);

  }

}
