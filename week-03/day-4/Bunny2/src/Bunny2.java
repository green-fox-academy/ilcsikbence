public class Bunny2 {
  public static void main(String[] args) {

    System.out.println(numOfEars(3));


  }


  public static int numOfEars (int n) {

    if (n == 0) {
      return 0;
    } else if (n % 2 == 1){
      return numOfEars(n - 1) + 3;
    } else {
      return numOfEars(n - 1) + 2;
    }

  }
}
