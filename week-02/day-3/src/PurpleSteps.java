import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

    int sizeOfSquare = 20;

    for (int i = 0; i < 20; i++) {
      graphics.setColor(new Color(177, 69, 243));
      graphics.fillRect(i * sizeOfSquare + sizeOfSquare, i * sizeOfSquare + sizeOfSquare, sizeOfSquare, sizeOfSquare);
      graphics.setColor(Color.BLACK);
      graphics.drawRect(i * sizeOfSquare + sizeOfSquare, i * sizeOfSquare + sizeOfSquare, sizeOfSquare, sizeOfSquare);

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