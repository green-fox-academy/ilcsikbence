import java.util.HashMap;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

//    System.out.println(ticTacResult("win-o.txt"));
//    // should print O
//
//    System.out.println(ticTacResult("win-x.txt"));
//    // should print X
//
//    System.out.println(ticTacResult("draw.txt"));
//    // should print draw

    int array[][] = new int[3][3];
    int X = 3;
    int O = 11;

    array[0][0] = X; // 1
    array[0][1] = O; // 2
    array[0][2] = X; // 3
    array[1][0] = O; // 4
    array[1][1] = X; // 5
    array[1][2] = O; // 6
    array[2][0] = O; // 7
    array[2][1] = X; // 8
    array[2][2] = X; // 9

    HashMap<Integer, Integer> table = new HashMap<>();

    table.put(1, array[0][0]);
    table.put(2, array[0][1]);
    table.put(3, array[0][2]);
    table.put(4, array[1][0]);
    table.put(5, array[1][1]);
    table.put(6, array[1][2]);
    table.put(7, array[2][0]);
    table.put(8, array[2][1]);
    table.put(9, array[2][2]);

    if ((table.get(1) + table.get(2) + table.get(3)) == 9) {
      System.out.println("X won");
    } else if ((table.get(1) + table.get(2) + table.get(3)) == 33) {
      System.out.println("O won");
    } else if ((table.get(1) + table.get(4) + table.get(7)) == 9) {
      System.out.println("X won");
    } else if ((table.get(1) + table.get(4) + table.get(7)) == 33) {
      System.out.println("O won");
    } else if ((table.get(1) + table.get(5) + table.get(9)) == 9) {
      System.out.println("X won");
    } else if ((table.get(1) + table.get(5) + table.get(9)) == 33) {
      System.out.println("O won");
    } else if ((table.get(3) + table.get(5) + table.get(7)) == 9) {
      System.out.println("X won");
    } else if ((table.get(3) + table.get(5) + table.get(7)) == 33) {
      System.out.println("O won");
    } else if ((table.get(4) + table.get(5) + table.get(6)) == 9) {
      System.out.println("X won");
    } else if ((table.get(4) + table.get(5) + table.get(6)) == 33) {
      System.out.println("O won");
    } else if ((table.get(7) + table.get(8) + table.get(9)) == 9) {
      System.out.println("X won");
    } else if ((table.get(7) + table.get(8) + table.get(9)) == 33) {
      System.out.println("O won");
    } else if ((table.get(2) + table.get(5) + table.get(8)) == 9) {
      System.out.println("X won");
    } else if ((table.get(2) + table.get(5) + table.get(8)) == 33) {
      System.out.println("O won");
    } else if ((table.get(3) + table.get(6) + table.get(9)) == 9) {
      System.out.println("X won");
    } else if ((table.get(3) + table.get(6) + table.get(9)) == 33) {
      System.out.println("O won");
    } else {
      System.out.println("It's a draw");
    }





    System.out.println(table);

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          System.out.print(array[i][j]);
        }
      }
      System.out.println();
    }

//  public static String result(String filename) {
//
//  }


  }
}