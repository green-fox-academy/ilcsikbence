public class Sum {
  public static void main(String[] args) {

    int number1 = 100;

    System.out.println(sum(number1));

  }

  public static int sum (int number1){

    int sum = 0;

      for (int i = 1; i <= number1; ++i) {
        sum += i;
    }

    return sum;
  }
}
