import java.util.*;

public class HexToDecimal {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String number = scanner.nextLine();

    String number = "2";
    String numberNew = "";

    if (number.contains("2"))
      number.replace("2", "0010");
    System.out.println(number);
    if (number.contains("3"))
      number.replace("3", "0011");
    if (number.contains("4"))
      number.replace("4", "0100");
    if (number.contains("5"))
      number.replace("5", "0101");
    if (number.contains("6"))
      number.replace("6", "0110");
    if (number.contains("7"))
      number.replace("7", "0111");
    if (number.contains("8"))
      number.replace("8", "1000");
    if (number.contains("9"))
      number.replace("9", "1001");
    if (number.contains("A"))
      number.replace("A", "1010");
    if (number.contains("B"))
      number.replace("B", "1011");
    if (number.contains("C"))
      number.replace("C", "1100");
    if (number.contains("D"))
      number.replace("D", "1101");
    if (number.contains("E"))
      number.replace("E", "1110");
    if (number.contains("F"))
      number.replace("F", "1111");


    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.addAll(Arrays.asList(number.split("")));

//    String newNumber = arrayList.toString();
//
//    ArrayList<String> newArrayList = new ArrayList<>();
//    newArrayList.addAll(Arrays.asList(newNumber.split("")));


    System.out.println(arrayList);

    ArrayList<Integer> arrayNumbers = new ArrayList<>();
    int arraySize = arrayNumbers.size();
    for (int i = 0; i < arraySize; i++) {
      int numberParsed = Integer.parseInt((arrayList.get(i)));
      arrayNumbers.add(numberParsed);
    }

    toDecimal(arrayNumbers, arraySize);
  }

  public static void toDecimal(ArrayList<Integer> arrayNumbers, int arraySize) {

    int result = 0;
    for (int i = 0; i < arraySize; i++) {
      int powNum = arrayNumbers.get(i) * (int) Math.pow(16, arraySize - 1 - i);
      result += powNum;
    }
    System.out.println(result);
  }
}
