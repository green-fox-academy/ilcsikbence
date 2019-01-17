public class RandomNumber {
  public static void main(String[] args) {

    int integerStart = (int)(Math.random()*50);
    System.out.println(integerStart);

    int sum = 0;
    for (int i = 0; i < 5; i++) {
        sum += integerStart;
    }

    for (int i = 0; i < 5; i++) {
      int int1 = (int)(Math.random() * 50);
      int int2 = (int)(Math.random() * 50);

      if (int1 > int2) {
        int2 = (int)(Math.random() * 50);
      }
    }


    System.out.println(sum);

  }

  public static int randomNum() {
    return (int)(Math.random()* 50);
  }
}
