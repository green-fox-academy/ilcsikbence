import javax.swing.*;
import java.awt.*;

public class PositionedImage {

  private final static int TILE_SIZE = 4;
  Image image;
  int posX, posY;

  public PositionedImage(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    try {
      image = new ImageIcon(filename).getImage();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * TILE_SIZE, posY * TILE_SIZE, Main.board);
    }
  }

  public void setImage(String filename) {
    try {
      image = new ImageIcon(filename).getImage();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}