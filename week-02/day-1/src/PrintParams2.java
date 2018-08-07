public class PrintParams2 {
  public static void main(String[] args) {
    printParams();
  }

  public static void printParams(String... a) {
    for (String i : a)
      System.out.print(i + " ");
    System.out.println();
  }
}
