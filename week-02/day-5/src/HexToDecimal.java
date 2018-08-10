import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String number = scanner.nextLine();
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.addAll(Arrays.asList(number.split("")));
    int arraySize = arrayList.size();

    ArrayList<Integer> arrayNumbers = new ArrayList<>();

    for (int i = 0; i < arraySize; i++) {
      int numberParsed = Integer.parseInt((arrayList.get(i)));
      arrayNumbers.add(numberParsed);
    }

    if (arrayNumbers.contains(2) || arrayNumbers.contains(3) || arrayNumbers.contains(4) || arrayNumbers.contains(5) || arrayNumbers.contains(6) || arrayNumbers.contains(7) || arrayNumbers.contains(8) || arrayNumbers.contains(9)) {
      System.out.println("Please type only 1s and 0s!");
    } else {
      toDecimal(arrayNumbers, arraySize);
    }
  }

  public static void toDecimal(ArrayList<Integer> arrayNumbers, int arraySize) {

    int result = 0;
    for (int i = 0; i < arraySize; i++) {
      int powNum = arrayNumbers.get(i) * (int) Math.pow(2, arraySize - 1 - i);
      result += powNum;
    }
    System.out.println(result);
  }
}
