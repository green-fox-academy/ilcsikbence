public class SouthEast extends Direction implements Movable {
  @Override
  public String action(DVDIcon dvdIcon, int counter, String direction) {
    dvdIcon.posX++;
    dvdIcon.posY++;

    if (dvdIcon.posY == 504 / 4 - 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "NE";
    }
    if (dvdIcon.posX == 600 / 4 - 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "SW";
    }

    return direction;
  }
}
