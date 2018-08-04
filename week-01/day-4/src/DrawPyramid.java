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

    for (int myLines = 1; myLines <= height; myLines++) {
      for (int mySpace = 1; mySpace <= height - myLines; mySpace++) {
        System.out.print(" ");
      }

              for (int myStars = 1; myStars <= 2*myLines - 1; myStars++) {
          System.out.print("*");
        }


//      if (height % 2 == 0){
//      for (int myStars = myLines + 2; myStars >= height - myLines; myStars--) {
//        System.out.print("*");
//      }
//      }
//      if (height % 2 == 1){
//        for (int myStars = myLines + 1; myStars >= height - myLines; myStars--) {
//          System.out.print("*");
//        }
//      }

      System.out.println();
    }

  }


}









