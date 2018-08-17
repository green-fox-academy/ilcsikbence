import javax.swing.*;

import java.awt.*;
import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {

    int size = 550;
    int startPosAY = HEIGHT / 2 - size / 2;
    int startPosAX = WIDTH / 2 - size / 2;

    drawFractal(startPosAX, startPosAY, size, graphics);

  }


  public static void drawCircle(int startPosX, int startPosY, int size, Graphics graphics) {
    graphics.drawOval(startPosX, startPosY, size, size);

  }


  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawCircle(x, y, size, graphics);

    if (size > 5) {
      drawFractal(x * 2, y, size / 2, graphics);
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