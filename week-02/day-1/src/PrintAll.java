public class PrintAll {
  public static void main(String[] args) {
    int numbers[] = {4, 5, 6, 7};
    String zero = "";

    for (int k = 0; k < numbers.length; k++) {
      if (k == 0){
        zero += "[";
        zero += numbers[0];
        zero += ", ";
      }
      else if
      (k != 0 && k < numbers.length - 1){
        zero += numbers[k];
        zero += ", ";
      } else {
        zero += numbers[k];
        zero += "]";
      }

    }
    System.out.println(zero);
  }
}
