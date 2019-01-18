public class Main {
  public static void main(String[] args) {
    Carrier carrier = new Carrier(10000, 1000);
    Carrier carrier2 = new Carrier(10000, 1000);

    FighterJet F16 = new F16();

    carrier.addMovable(F16);

    carrier.reloadAll();
    carrier.fight(carrier2);
    carrier.readStatus();
  }
}
