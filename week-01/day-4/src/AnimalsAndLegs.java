import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type the number of chickens:");
    int chickenNum = scanner.nextInt();

    System.out.println("Type the number of pigs:");
    int pigNum = scanner.nextInt();

    int chkLegsNum = chickenNum * 2;
    int pigLegsNum = pigNum * 4;

    int allLegs = chkLegsNum + pigLegsNum;

    System.out.println("All the animals have " + allLegs + " legs.");
  }
}