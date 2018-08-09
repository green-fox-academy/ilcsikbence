import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int heightZero = 0;
    int heightMax = HEIGHT;
    int widthZero = 0;
    int widthMax = WIDTH;
    int x0 = 0;
    int y0 = 0;

    // Left side
    for (int i = 0; i <= HEIGHT / 20; i++) {
      drawLines(0, heightZero, graphics);
      heightZero += 20;
    }
    // Right side
    for (int i = 1; i <= HEIGHT / 20; i++) {
      drawLines(WIDTH, heightMax, graphics);
      heightMax -= 20;
    }
    // Bottom side
    for (int k = 0; k <= WIDTH / 20; k++) {
      drawLines(widthZero, heightZero, graphics);
      widthZero += 20;
    }
    // Upper side
    for (int k = 0; k <= WIDTH / 20; k++) {
      drawLines(x0, y0, graphics);
       x0 += 20;
    }
  }

  public static void drawLines(int x, int y, Graphics graphics) {
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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