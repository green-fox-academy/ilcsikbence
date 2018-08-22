public class Main {
  public static void main(String[] args) {

    Gnirts g = new Gnirts("Example");
    System.out.println(g.length());
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(0, 5));

    Shifter s = new Shifter("Example", 2);
    System.out.println(s.charAt(0));
  }
}
