public class Power {
  public static void main(String[] args) {
    System.out.println(power(2, 1));
  }

  public static long power (long base, long n) {

    if (n == 0) {
      return 1;
    } else {
      return base * power(base, n - 1);
    }
  }
}
