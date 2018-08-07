import java.util.*;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type the amount of the numbers you want to enter");
    int amount = scanner.nextInt();

    double
        myArray[] = new double[amount];

    for (int i = 0; i < amount; i++) {
      int number = scanner.nextInt();
      myArray[i] += number;
    }

    System.out.println("Sum: " + Sum(myArray) + " Average: " + Avg(myArray));

  }

  public static double Sum(double[] ints) {
    int result = 0;
    for (double i : ints) {
      result += i;
    }
    return result;
  }

  public static double Avg(double[] ints) {
    return Sum(ints) / ints.length;
  }
}




