import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type in 2 numbers:");

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    if (num1 > num2) {
      System.out.println(num1 + " is bigger.");
    } else if (num1 < num2) {
      System.out.println(num2 + " is bigger.");
    } else if (num1 == num2) {
      System.out.println("The two numbers are the same");
    }


  }
}
