public class Bunny1 {
  public static void main(String[] args) {
    System.out.println(numberOfEars(5));
  }

  public static int numberOfEars(int n) {

    if (n == 0) {
      return 0;
    } else {
      return numberOfEars(n - 1) + 2;
    }
  }
}
