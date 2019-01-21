import java.awt.*;

public class DVDIcon extends PositionedImage {

  @Override
  public void draw(Graphics graphics) {
    super.draw(graphics);
  }

  @Override
  public void setImage(String filename) {
    super.setImage(filename);
  }

  public DVDIcon(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }

}
