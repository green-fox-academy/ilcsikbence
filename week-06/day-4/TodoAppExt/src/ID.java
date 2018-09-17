public class ID {
  static int id = TodoIO.IDsList.size();

  public ID() {
    this.id += 1;
  }

  public static int getId() {
    return id;
  }
}