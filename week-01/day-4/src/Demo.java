import java.util.Arrays;

public class Demo {
  public static void main(String[] args) {

    String myArrayA[][] = {{"%", " "},{"%"," "}};
    for (int q = 0; q < 4; q++) {


      for (int i = 0; i < 2; i++) {
        for (int a = 0; a < 2; a++) {
          for (int b = 0; b < 2; b++) {

            System.out.print(myArrayA[a][b]);

          }
        }
      }

      System.out.println();

      String myArrayB[][] = {{" ", "%"}, {" ", "%"}};

      for (int n = 0; n < 2; n++) {
        for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {

            System.out.print(myArrayB[i][j]);
          }
        }
      }

      System.out.println();
    }

    for (int o = 0; o < 4; o++) {
      for (int p = 0; p < 1; p++) {
        for (int q = 0; q < 4; q++) {
          for (int r = 0; r < 1; r++) {
            System.out.print("%");
            System.out.print(" ");
          }
        }
        System.out.println();
      }

      for (int i = 0; i < 1; i++) {
        for (int k = 0; k < 4; k++) {
          for (int j = 0; j < 1; j++) {
            System.out.print(" ");
            System.out.print("%");
          }
        }
        System.out.println();
      }
    }

  }
}
