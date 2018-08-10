import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryHexConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Binary or HexaDecimal");
    String binOrHex = scanner.nextLine();
    String number = "123";
    ArrayList<String> numberArray = new ArrayList<>();
    numberArray.addAll(Arrays.asList(number.split("")));

    int arraySize = numberArray.size();



    if (binOrHex.equals("Binary")){

    }

    if (binOrHex.equals("HexaDecimal")){

    }

  }

  public static void Binary (ArrayList numberArray, int arraySize){

    for (int i = 0; i < arraySize; i++) {
      Math.pow(0, i);
    }

  }
}
