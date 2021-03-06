import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    for (int i = 1; i < WIDTH / 32; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(i * 16, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - 16 * i);
      graphics.drawLine(i * 16, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + 16 * i);
      graphics.drawLine(WIDTH - i * 16, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + 16 * i);
      graphics.drawLine(WIDTH - i * 16, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - 16 * i);
      graphics.drawLine(WIDTH / 2, 0 + 16, WIDTH / 2, HEIGHT - 16);
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