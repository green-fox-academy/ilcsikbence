import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareFractal {
  public static void mainDraw(Graphics graphics){

    int size = WIDTH;
    int startPosX = WIDTH / 2 - size / 2;
    int startPosY = HEIGHT / 2 - size / 2;
    drawFractal(startPosX, startPosY, size, graphics);
  }


  public static void drawRect(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(WIDTH / 3, 0, size, size);
    graphics.drawRect(x, y, size, size);
    graphics.drawRect(WIDTH / 3, HEIGHT * 2 / 3, size, size);
    graphics.drawRect(0, y, size, size);
    graphics.drawRect(WIDTH * 2 / 3, y, size, size);

  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawRect(x, y, size, graphics);

    if (size > 30) {
//      Random random = new Random();
//      graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
      drawFractal(x, y, size / 3, graphics);
      drawFractal(x + size * 2 / 3, y, size / 3, graphics);
      drawFractal(x + size * 2 / 3, y + size * 2 / 3, size / 3, graphics);
      drawFractal(x, y + size * 2 / 3, size / 3, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 633;
  static int HEIGHT = 633;

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