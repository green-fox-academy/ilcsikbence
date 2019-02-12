public class SouthWest extends Direction implements Movable {
  @Override
  public String action(DVDIcon dvdIcon, int counter, String direction) {
    dvdIcon.posX--;
    dvdIcon.posY++;

    if (dvdIcon.posX == 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "SE";
    }
    if (dvdIcon.posY == 504 / 4 - 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "NW";
    }

    return direction;
  }
}
