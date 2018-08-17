import javax.swing.*;

import java.awt.*;
import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleNew {
  public static void mainDraw(Graphics graphics) {

    int startPosX = 0;
    int startPosY = 0;
    int size = WIDTH;

    drawFractal(startPosX, startPosY, size, graphics);
  }


  public static void drawTriangle(int startPosX, int startPosY, int size, Graphics graphics) {
    int xPoints[] = {startPosX, startPosX + size, startPosX + size / 2};
    int yPoints[] = {startPosY, startPosY, startPosY + (int)((Math.sqrt(3) / 2) * size)};
    graphics.drawPolygon(xPoints, yPoints, 3);
  }

  public static void drawFractal(int startPosX, int startPosY, int size, Graphics graphics) {
    drawTriangle(startPosX, startPosY, size, graphics);
    int height = (int)(Math.sqrt(3) / 2 * size);

    if (size > 10) {
      drawFractal(startPosX, startPosY, size / 2, graphics);
      drawFractal(startPosX + size / 2, startPosY, size / 2, graphics);
      drawFractal(startPosX + size / 4, startPosY + height / 2, size / 2, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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