import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.


    for (int i = 0; i < 4; i++) {
      double x1 = 0 + Math.random() * WIDTH + 1;
      double y1 = 0 + Math.random() * HEIGHT + 1;
      double x2 = 20 + Math.random() * 20;
      double y2 = 20 + Math.random() * 20;

      int x1Int = (int)Math.round(x1);
      int y1Int = (int)Math.round(y1);
      int x2Int = (int)Math.round(x2);
      int y2Int = (int)Math.round(y2);

      double colorR = 0 + Math.random() * 255;
      double colorG = 0 + Math.random() * 255;
      double colorB = 0 + Math.random() * 255;

      int intColorR = (int)Math.round(colorR);
      int intColorG = (int)Math.round(colorG);
      int intColorB = (int)Math.round(colorB);

      graphics.setColor(new Color(intColorR, intColorG, intColorB));
      graphics.fillRect(x1Int, y1Int, x2Int, y2Int);

    }


  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}