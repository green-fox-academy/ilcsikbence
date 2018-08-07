import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a number to guess");

    int numResult = 8;
    int guessNum = scanner.nextInt();

    if (guessNum < numResult) {
      System.out.println("The stored number is higher");
    }

    if (guessNum > numResult) {
      System.out.println("The stored number is lower");
    }

    if (guessNum == numResult) {
      System.out.println("You found the number: " + numResult);

    }

  }
}
