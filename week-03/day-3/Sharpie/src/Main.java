public class Main {
  public static void main(String[] args) {
    Sharpie newSharpie = new Sharpie("black", 12);
    newSharpie.use();
    System.out.println(newSharpie.inkAmount);
  }
}
