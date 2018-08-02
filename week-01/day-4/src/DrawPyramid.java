import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    * - 3 spaces - 1 *
    //   *** - 2 spaces - 3 *
    //  ***** - 1 space - 5 *
    // ******* - 0 space - 7 *
    //
    // The pyramid should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type as many number as you want your pyramid's height to be");

    int height = scanner.nextInt();
    String text = "";
    String space = " ";
    String myText = "*";

    for(int i = 0; i < height;i++) {
      for(int j = 0; j < height - i; j++) {
        System.out.print(" ");
      }
      for(int k = 0; k <= i; k++) {
        System.out.print(myText);

      }
      System.out.println();
    }
  }







  }

