import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a number that you want your square's height to be");

    int amount = scanner.nextInt();


    for (int i = 1; i <= amount; i++) {

      if (i == 1 || i == amount) {

        for (int j = 0; j < amount; j++) {
          System.out.print("%");
        }
      } else {
        System.out.print("%");
        for (int w = 0; w < amount - 2; w++) {
          System.out.print(" ");
        }
        System.out.print("%");
      }
//      if (i > 1 || i >= amount) {
//        for (int f = 0; f < 1; f++) {
//          System.out.print("%");
//        }
//      }
//      if (i > 1 || i >= amount) {
//        for (int w = 0; w < amount - 2; w++) {
//          System.out.print(" ");
//        }
//      }
//      if (i > 1 || i >= amount) {
//        for (int r = 0; r < 1; r++) {
//          System.out.print("%");
//        }
//      }
      System.out.println();
    }


  }
}
