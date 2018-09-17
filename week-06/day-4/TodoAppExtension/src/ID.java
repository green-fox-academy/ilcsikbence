public class ID {
  static int id = TodoLogic.tasks.size();

  public ID() {
    this.id += 1;
  }

  public static int getId() {
    return id;
  }
}