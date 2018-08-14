public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    int number0 = 0;
    int number1 = 5;

    divideByZero(number0);
    divideByZero(number1);
  }

  public static void divideByZero (int number1){
    try {
      int result = 10 / number1;
      System.out.println(result);
    } catch (ArithmeticException ex){
      System.out.println("fail");
    }
  }
}
