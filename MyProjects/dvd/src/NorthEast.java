public class NorthEast extends Direction implements Movable {

  @Override
  public String action(DVDIcon dvdIcon, int counter, String direction) {
    dvdIcon.posX++;
    dvdIcon.posY--;

    if (dvdIcon.posX == 600 / 4 - 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "NW";
    }
    if (dvdIcon.posY == 1) {
      dvdIcon.setImage(setImageSource());
      counter++;
      return "SE";
    }

    return direction;
  }

}
