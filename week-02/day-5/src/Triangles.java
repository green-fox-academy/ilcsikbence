import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 15; i++) {
      graphics.drawLine(0 + 11 * 2 * i, HEIGHT, WIDTH/ 2 + 11 * i, 0 + 11 * 2 * i);
    }
    for (int i = 0; i < 15; i++) {
      graphics.drawLine(0 + 11 * i, HEIGHT - 11 * i, WIDTH - 11 * i, HEIGHT - 11 * i);
    }

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