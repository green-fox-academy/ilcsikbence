import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonalFractal {
  public static void mainDraw(Graphics graphics){

//    drawFractal(0, 0, graphics);
//    hexagon.addPoint(  75,  25 ); WIDTH / 4 , 0
//    30        hexagon.addPoint( 175,  25 ); WIDTH * 3 /4 , 0
//    31        hexagon.addPoint( 225, 112 ); WIDTH, HEIGHT / 2
//    32        hexagon.addPoint( 175, 199 ); WIDTH * 3 / 4, HEIGHT
//    33        hexagon.addPoint(  75, 199 ); WIDTH / 4, HEIGHT
//    34        hexagon.addPoint(  25, 112 ); 0, HEIGHT / 2

  }

  public static void drawLine(int x, int y, int x2, int y2, Graphics graphics) {
//    graphics.drawLine(x, y, x + WIDTH / 2, y);
//    graphics.drawLine(x, y + HEIGHT, x + WIDTH / 2, y + HEIGHT);
//    graphics.drawLine(0, HEIGHT / 2, x, 0);
//    graphics.drawLine(0, HEIGHT / 2, x, HEIGHT);
//    graphics.drawLine(WIDTH, HEIGHT / 2, x * 3, HEIGHT);
//    graphics.drawLine(WIDTH, HEIGHT / 2, x * 3, 0);

    int xpoints[] = {WIDTH / 4, WIDTH * 3 / 4, WIDTH, WIDTH * 3 / 4, WIDTH / 4, 0};
    int ypoints[] = {0, 0, HEIGHT / 2, HEIGHT, HEIGHT, HEIGHT / 2};
    int npoints = 6;
    graphics.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void drawFractal(int x, int y, Graphics graphics) {

    drawLine(x, y, x * 2, y * 2, graphics);



  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 500;

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