public class Counter {
  public static void main(String[] args) {

   countDown(5);

  }

  public static int countDown (int n) {

    if (n == 0) {
      return 1;
    } else {
      System.out.println(n);
      return countDown(n - 1);
    }

  }

}
