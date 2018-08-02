import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type 5 numbers:");

    int integ1 = scanner.nextInt();
    int integ2 = scanner.nextInt();
    int integ3 = scanner.nextInt();
    int integ4 = scanner.nextInt();
    int integ5 = scanner.nextInt();

    int sum = integ1 + integ2 + integ3 + integ4 + integ5;
    int avg = (integ1 + integ2 + integ3 + integ4 + integ5) / 5;

    System.out.println("Sum: " + sum + " Average: " + avg);

  }
}
