public class PrintParams {
  public static void main(String[] args) {

    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...



    String[] numbers = {"first", "second", "third", "fourth", "fifth"};

    printParams(numbers);


  }

  public static void printParams(String[] numbers){

    String zero = "";

    for (int i = 0; i < numbers.length; i++) {
      if (i < numbers.length - 1) {
        zero += "\"";
        zero += numbers[i];
        zero += "\", ";
      } else {
        zero += "\"";
        zero += numbers[i];
        zero += "\"";
      }
    }

    System.out.println(zero);

  }

}
