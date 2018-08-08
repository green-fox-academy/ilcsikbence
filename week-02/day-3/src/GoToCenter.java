import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.

    int coordinates[] = drawLinesToCenter(0, 1).clone();
    int heightAndWidth[] = {HEIGHT, WIDTH};
    int height = HEIGHT/2;
    int width = WIDTH/2;

    System.out.println(coordinates[0]);

    graphics.drawLine(coordinates[0], coordinates[1], heightAndWidth[0], heightAndWidth[1]);


  }

  public static int[] drawLinesToCenter(int x1, int y1){
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    x1 = 0;
    y1 = 0;

    for (int i = 0; i < 3; i++) {
      x1 += userInput;
      y1 += userInput;
    }
    return new int[] {x1, y1};

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}