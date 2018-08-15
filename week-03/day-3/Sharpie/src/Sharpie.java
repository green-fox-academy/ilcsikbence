public class Sharpie {

  public Sharpie(String color, float width) {
    inkAmount = 100;
  }

  int inkAmount;

  public int use() {
    inkAmount = inkAmount - 1;
    return inkAmount;
  }
}
