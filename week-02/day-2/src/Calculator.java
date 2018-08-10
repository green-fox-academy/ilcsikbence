import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
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