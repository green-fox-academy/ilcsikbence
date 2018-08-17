import javax.swing.*;

import java.awt.*;
import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleFractal {
  public static void mainDraw(Graphics graphics) {

    int startPosYA = HEIGHT / 2;
    int startPosXA = WIDTH / 4;



    Point a = new Point(startPosXA, startPosYA);
    Point b = new Point(startPosXA * 3, startPosYA);
    Point c = new Point(topOfTriangle(new Point(0, 0), new Point(WIDTH, 0)));


    drawTriangle(a, b, c, graphics);

    distanceBetween(a, b, c);

  }


  public static void drawTriangle(Point a, Point b, Point c, Graphics graphics) {
    graphics.drawLine(a.x, a.y, b.x, b.y);
    graphics.drawLine(a.x, a.y, c.x, c.y);
    graphics.drawLine(b.x, b.y, c.x, c.y);




  }

  public static void distanceBetween(Point a, Point b, Point c) {

    double sideC = c.distance(a.x, b.x);
    double sideA = a.distance(b.x, Math.sqrt(Math.exp(sideC / 2) + (Math.exp((Math.sqrt(3) / 2) * sideC))));
//    double sideB =
    System.out.println(sideC);
  }

  public static Point topOfTriangle(Point a, Point b) {
    return new Point((a.x + b.x) / 2, (int) (a.y - Math.sqrt(3) / 2 * a.y));
  }


  public static void drawFractal(Point a, Point b, Point c, Graphics graphics) {

    drawTriangle(a, b, c, graphics);

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