import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {
  public static void mainDraw(Graphics graphics) {
    int size = WIDTH / 3;
    int startPosX = WIDTH / 2 - size / 2;
    int startPosY = HEIGHT / 2 - size / 2;

    drawFractal(startPosX, startPosY, size, graphics);

  }

  public static void drawSquare(int startPosX, int startPosY, int size, Graphics graphics) {
    graphics.fillRect(startPosX, startPosY, size, size);
  }

  public static void drawFractal(int startPosX, int startPosY, int size, Graphics graphics) {

    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    drawSquare(startPosX, startPosY, size, graphics);

    if (size > 1) {
      drawFractal(startPosX - size * 2 / 3, startPosY + size / 3, size / 3, graphics);
      drawFractal(startPosX - size * 2 / 3, startPosY + size / 3 * 4, size / 3, graphics);
      drawFractal(startPosX - size * 2 / 3, startPosY - size / 3 * 2, size / 3, graphics);
      drawFractal(startPosX + size / 3, startPosY + size / 3 * 4, size / 3, graphics);
      drawFractal(startPosX + size / 3, startPosY - size / 3 * 2, size / 3, graphics);
      drawFractal(startPosX + size * 4 / 3, startPosY + size / 3, size / 3, graphics);
      drawFractal(startPosX + size * 4 / 3, startPosY + size / 3 * 4, size / 3, graphics);
      drawFractal(startPosX + size * 4 / 3, startPosY - size / 3 * 2, size / 3, graphics);
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