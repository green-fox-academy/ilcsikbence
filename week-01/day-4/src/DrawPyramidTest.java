import java.util.Scanner;

public class DrawPyramidTest {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Type in a number that you want your pyramid's height to be: ");

    int userInput = scanner.nextInt();

    for (int i = 1; i <= userInput; i++) {
      for (int j = userInput - 1; j >= i ; j--) {
        System.out.print(" ");
      }
      for (int k = 2; k <= 2*i; k++) {
        System.out.print("%");
      }
      System.out.println();
    }

  }
}
