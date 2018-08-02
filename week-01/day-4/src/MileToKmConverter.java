import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please write into console \"1\" if you want to convert mile to km and write \"2\" if you want to convert km to mile.");
    int choice = scanner.nextInt();
    if (choice == 2) {

      System.out.println("Please type the distance in kilometers that you want to convert to miles:");
      int kmValue = scanner.nextInt();

      double mileValue = 1.609344;
      double nauMileValue = 1.852;

      double resMileValue = kmValue / mileValue;
      double resNauMileValue = kmValue / nauMileValue;

      System.out.println("It is " + resMileValue + " miles.");
      System.out.println("It is " + resNauMileValue + " nautical miles");
    } else if (choice == 1){

      System.out.println("Please type the distance in miles that you want to convert to kilometers:");
      int mileValue2 = scanner.nextInt();
      double mileValue = 1.609344;
      double nauMileValue = 1.852;

      double resMileToKm = mileValue2 * mileValue;
      double resMileToNauKm = mileValue2 * nauMileValue;

      System.out.println("It is " + resMileToKm + " kilometers in miles.");
      System.out.println("It is " + resMileToNauKm + " kilometers in nautical miles.");
    }
  }
}