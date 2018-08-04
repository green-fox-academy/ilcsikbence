import java.util.Scanner;

public class DrawSquareTest {
  public static void main(String[] args) {


//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Type a number that you want your square's height to be");
//
//    int amount = scanner.nextInt();

    int amount = 6;

    for (int i = 1; i <= amount; i++) {

      if (i == 1 || i == amount) {

        for (int j = 0; j < amount - 0; j++) {
          System.out.print("%");
        }
      }
      for (int j = 0; j < 1; j++) {

        if (i > 1 || i >= amount) {
          for (int f = 0; f < 1; f++) {
            System.out.print("%");
          }
        }
        if (i > 1 || i >= amount) {
          for (int w = 0; w < amount - 2; w++) {
            System.out.print(" ");
          }
        }
        if (i > 1 || i >= amount) {
          for (int r = 0; r < 1; r++) {
            System.out.print("%");
          }
        }
        System.out.println();
      }
//      System.out.println();
    }


  }
}
