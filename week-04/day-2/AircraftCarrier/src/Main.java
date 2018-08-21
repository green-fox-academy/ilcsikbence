public class Main {
  public static void main(String[] args) {
    F16 f16 = new F16();

//    System.out.println(f16.getStatus());
//    System.out.println(f16.refill(100));
//    System.out.println(f16.getStatus());
//    f16.fight();
//    System.out.println(f16.getStatus());
//    System.out.println(f16.getType());
    Carrier carrier2 = new Carrier(10, 1111);
    Carrier carrier = new Carrier(14, 2222);
    carrier.add(new F35());
    carrier.add(new F16());
    carrier.add(new F16());
    carrier.fill();
    carrier.getStatus();
    carrier2.add(new F35());
    carrier2.add(new F16());
    carrier2.fill();
    carrier2.getStatus();
    carrier.fight(carrier2);
    System.out.println(carrier2.healthPoint);
    System.out.println(carrier.healthPoint);
  }
}
