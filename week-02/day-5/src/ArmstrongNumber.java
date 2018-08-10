import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String number = scanner.nextLine();

    ArrayList<String> numberArray = new ArrayList<>();
    numberArray.addAll(Arrays.asList(number.split("")));

    int arraySize = numberArray.size();

    if (arraySize == 4) {
      int numOriginal = Integer.parseInt(numberArray.get(0)) * 1000 +  Integer.parseInt(numberArray.get(1)) * 100 + Integer.parseInt(numberArray.get(2)) * 10 + Integer.parseInt(numberArray.get(3));
      int num1 = Integer.parseInt(numberArray.get(0));
      int num2 = Integer.parseInt(numberArray.get(1));
      int num3 = Integer.parseInt(numberArray.get(2));
      int num4 = Integer.parseInt(numberArray.get(3));

      double resFour = Math.pow(num1, 4) + Math.pow(num2, 4) + Math.pow(num3, 4) + Math.pow(num4, 4);

      if (resFour == numOriginal){
        System.out.println("The " + numOriginal + " is an Armstrong number.");
      } else {
        System.out.println("The " + numOriginal + " is not an Armstrong number.");
      }

    } else if (arraySize == 3) {
      int numOriginal = Integer.parseInt(numberArray.get(0)) * 100 +  Integer.parseInt(numberArray.get(1)) * 10 + Integer.parseInt(numberArray.get(2));
      int num1 = Integer.parseInt(numberArray.get(0));
      int num2 = Integer.parseInt(numberArray.get(1));
      int num3 = Integer.parseInt(numberArray.get(2));

      double resFour = Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3);

        if (resFour == numOriginal){
          System.out.println("The " + numOriginal + " is an Armstrong number.");
        } else {
          System.out.println("The " + numOriginal + " is not an Armstrong number.");
        }
    } else {
      System.out.println("Type in a 3 or a 4 digit number!");
    }
  }
}