import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int squareSize = 20;
    int squarePos = 20;

    int xySquare = 0;
    for (int i = 0; i < HEIGHT / squareSize; i++) {
      for (int j = 0; j < WIDTH / squareSize; j++) {
        graphics.fillRect(2 * xySquare, i * squarePos, squareSize, squareSize);
        xySquare += squareSize;
      }
      for (int k = 1; k <= WIDTH / squareSize; k++) {
        xySquare += squareSize;
        graphics.fillRect(2 * xySquare, squarePos + squarePos, squareSize, squareSize);
      }
    }
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