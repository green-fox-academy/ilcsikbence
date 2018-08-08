import javax.swing.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    HashMap<Integer, Color> hashColors = new HashMap<>();

    hashColors.put(1, Color.RED);
    hashColors.put(2, Color.ORANGE);
    hashColors.put(3, Color.YELLOW);
    hashColors.put(4, Color.GREEN);
    hashColors.put(5, Color.BLUE);
    hashColors.put(6, new Color(111, 0, 255));
    hashColors.put(7, new Color(127, 0, 255));

    int input2 = 0;
    int height = 320;
    int input = height;

    for (int i = 1; i <= 7 ; i++) {
      input2 = i;
      rainbowSquare(input, input2, hashColors, graphics);
      input -= 40;
    }
  }

  public static void rainbowSquare(int input, int input2, HashMap<Integer, Color> hashColors, Graphics graphics) {
    graphics.setColor(hashColors.get(input2));
    graphics.fillRect(WIDTH / 2 - input / 2, HEIGHT / 2 - input / 2, input, input);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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