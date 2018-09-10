import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseFour {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers.stream().filter(x -> x * x > 20).forEach(System.out::println);
  }
}