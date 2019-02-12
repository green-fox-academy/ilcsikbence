public class NorthWest extends Direction implements Movable {
  @Override
  public String action(DVDIcon dvdIcon, int counter, String direction) {
    dvdIcon.posX--;
    dvdIcon.posY--;

    if (dvdIcon.posX == 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "NE";
    }
    if (dvdIcon.posY == 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "SW";
    }
    return direction;
  }
}
