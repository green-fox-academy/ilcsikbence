public class SayHello {
  public static void main(String[] args) {

    String name = "Bence";
    SayHello sh = new SayHello();

    sh.sayHelloTo(name);

  }


  public void sayHelloTo(String name){

    System.out.println("Hello " + name);

  }
}
