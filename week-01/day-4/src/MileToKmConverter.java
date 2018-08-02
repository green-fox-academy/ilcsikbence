import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    Scanner scanner = new Scanner(System.in);



    System.out.println("Please type the distance in kilometers that you want to convert to miles:");
    int kmValue = scanner.nextInt();

    double mileValue = 1.609344;

    double newValue = kmValue * mileValue;

    System.out.println("It is " + newValue + " miles.");

  }
}