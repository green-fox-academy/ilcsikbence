import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type as many number as you want your diamond's height to be");

    int height = scanner.nextInt();

    for (int myLines = 1; myLines <= height; myLines++) {
      for (int mySpace = 1; mySpace <= height - myLines; mySpace++) {
        System.out.print(" ");
      }

      for (int myStars = 1; myStars <= 2 * myLines - 1; myStars++) {
        System.out.print("*");
      }

      System.out.println();
    }

    if (height % 2 == 1) {
      for (int i = 0; i < height + 4; i++) {
        System.out.print("*");
      }
    }
      else if (height % 2 == 0){
        for (int i = 0; i < height + 5; i++) {
          System.out.print("*");
      }
    }
        System.out.println();

    for (int myLines = 1; myLines <= height; myLines++) {
      for (int mySpace = 1; mySpace <= height - myLines; mySpace++) {
        System.out.print(" ");
      }

      for (int myStars = 1; myStars <= 2 * myLines - 1; myStars++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }
}
