import java.util.*;

public class HexToDecimal {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String number = scanner.nextLine();

    String number = "223A";
    String numberNew = "";

//    if (number.contains("0"))
//      number.replace("0", "0000");
//    if (number.contains("1"))
//      number.replace("1", "0001");
      number = number.replace("2", "0010");
      number = number.replace("3", "0011");
      number = number.replace("4", "0100");
      number = number.replace("5", "0101");
      number = number.replace("6", "0110");
      number = number.replace("7", "0111");
      number = number.replace("8", "1000");
      number = number.replace("9", "1001");
      number = number.replace("A", "1010");
      number = number.replace("B", "1011");
      number = number.replace("C", "1100");
      number = number.replace("D", "1101");
      number = number.replace("E", "1110");
      number = number.replace("F", "1111");

    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.addAll(Arrays.asList(number.split("")));

    System.out.println(arrayList);

    ArrayList<Integer> arrayNumbers = new ArrayList<>();
    int arraySize = arrayList.size();
    for (int i = 0; i < arraySize; i++) {
      int numberParsed = Integer.parseInt((arrayList.get(i)));
      arrayNumbers.add(numberParsed);
    }

    toDecimal(arrayNumbers, arraySize);
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
