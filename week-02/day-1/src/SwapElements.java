public class SwapElements {
  public static void main(String[] args) {
    String abc[] = {"first", "second", "third"};

    String newElement = abc[0];
    abc[0] = abc [2];
    abc[2] = newElement;

    for (String s: abc)
    {
      System.out.println(s);
    }

  }
}
