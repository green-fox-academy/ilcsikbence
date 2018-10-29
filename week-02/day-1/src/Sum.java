import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.println(sum(number));
  }

  public static int sum(int number) {
    int sum = 0;
    for (int i = 1; i <= number; ++i) {
      sum += i;
    }

    return sum;
  }

}