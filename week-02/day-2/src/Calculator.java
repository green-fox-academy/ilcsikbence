import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression");

    String userInput = scanner.nextLine();

    String opArray[] = userInput.split(" ");

    String operation = opArray[0];
    int number1 = Integer.parseInt(opArray[1]);
    int number2 = Integer.parseInt(opArray[2]);

    System.out.println(calculate(operation, number1, number2));
  }

  static int calculate(String operation, int number1, int number2) {
    if (operation.equals("+")) {
      return number1 + number2;
    } else if (operation.equals("-")) {
      return number1 - number2;
    } else if (operation.equals("*")) {
      return number1 * number2;
    } else if (operation.equals("/")) {
      return number1 / number2;
    } else if (operation.equals("%")) {
      return number1 % number2;
    } else {
      return 0;
    }
  }
}